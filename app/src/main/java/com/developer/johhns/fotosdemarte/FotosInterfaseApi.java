package com.developer.johhns.fotosdemarte;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FotosInterfaseApi {

    @GET("photos")
    Call<List<FotoDeMarte>> obtenerFotos();

}
