package com.developer.johhns.fotosdemarte;

import com.squareup.moshi.Moshi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class FotosApiAdaptador {

    public FotosInterfaseApi establecerConexion() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://android-kotlin-fun-mars-server.appspot.com/")
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

        return retrofit.create( FotosInterfaseApi.class ) ;

    }

}
