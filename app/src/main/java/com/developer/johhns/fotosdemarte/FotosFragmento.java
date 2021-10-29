package com.developer.johhns.fotosdemarte;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.johhns.fotosdemarte.databinding.FotosFragmentoBinding;

public class FotosFragmento extends Fragment {

    FotosFragmentoBinding binding ;


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

        binding = FotosFragmentoBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());

        return binding.getRoot() ;
        //return inflater.inflate(R.layout.fotos_fragmento, container, false);
    }
}