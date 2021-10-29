package com.developer.johhns.fotosdemarte;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developer.johhns.fotosdemarte.databinding.FotosFragmentoBinding;
import com.developer.johhns.fotosdemarte.databinding.GridViewItemBinding;

import java.util.List;

public class FotosRecViewAdaptador  extends RecyclerView.Adapter<FotosRecViewAdaptador.ViewHolder> {

    List<FotoDeMarte> fotos ;
    GridViewItemBinding binding ;
    public FotosRecViewAdaptador(List<FotoDeMarte> fotos, Context contexto ) {
        this.fotos   = fotos;
        this.binding = GridViewItemBinding.inflate( LayoutInflater.from( contexto ) ) ;
    }

    @NonNull
    @Override
    public FotosRecViewAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = GridViewItemBinding.inflate( LayoutInflater.from ( parent.getContext() ) ) ;
        return new ViewHolder( binding.getRoot() ) ;
    }

    @Override
    public void onBindViewHolder(@NonNull FotosRecViewAdaptador.ViewHolder holder, int position) {
       //holder.foto.setImageResource(  );
        //holder.foto.setImageResource( fotos.get(position).urlImagen );
    }

    @Override
    public int getItemCount() {
        return fotos.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foto ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = binding.marsImage ;
        }
    }
}
