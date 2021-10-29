package com.developer.johhns.fotosdemarte;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.johhns.fotosdemarte.databinding.FotosFragmentoBinding;

import java.util.List;

public class FotosFragmento extends Fragment {

    FotosFragmentoBinding binding   ;
    FotosRecViewAdaptador adaptador ;
    FotosViewModel        viewModel = new FotosViewModel();

    public FotosFragmento() {

    }


    public static FotosFragmento newInstance(String param1, String param2) {
        FotosFragmento fragment = new FotosFragmento();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this ).get(FotosViewModel.class) ;
        binding   = FotosFragmentoBinding.inflate(getLayoutInflater());
        adaptador = new FotosRecViewAdaptador( (List<FotoDeMarte>) viewModel.fotos() , container.getContext() ) ;
        binding.fotosGrid.setAdapter( adaptador );
        //setContentView(binding.getRoot());
        return binding.getRoot() ;
        //return inflater.inflate(R.layout.fotos_fragmento, container, false);
    }
}