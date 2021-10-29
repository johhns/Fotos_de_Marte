package com.developer.johhns.fotosdemarte;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FotosViewModel extends ViewModel {

    private MutableLiveData<MarteApiEstado> _estado = new MutableLiveData<MarteApiEstado>();

    private MutableLiveData<List<FotoDeMarte>> _fotos;

    public FotosViewModel() {
        obtenerlasFotosDeMarte();
    }

    public LiveData<MarteApiEstado> estado(){
        return _estado ;
    }

    public LiveData<List<FotoDeMarte>> fotos(){
        return _fotos ;
    }

    private void obtenerlasFotosDeMarte() {

        _estado.setValue(MarteApiEstado.LOADING);
        FotosApiAdaptador adaptador = new FotosApiAdaptador();
        FotosInterfaseApi endpoint =adaptador.establecerConexion() ;
        Call<List<FotoDeMarte>> fotoResponseCall = endpoint.obtenerFotos() ;
        fotoResponseCall.enqueue(new Callback<List<FotoDeMarte>>() {
            @Override
            public void onResponse(Call<List<FotoDeMarte>> call, Response<List<FotoDeMarte>> response) {
                _fotos.setValue( response.body() );
                _estado.setValue( MarteApiEstado.DONE );
            }

            @Override
            public void onFailure(Call<List<FotoDeMarte>> call, Throwable t) {
                _estado.setValue( MarteApiEstado.ERROR );
            }
        });

    }

}
