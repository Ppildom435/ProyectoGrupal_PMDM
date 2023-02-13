package com.example.socialdrivemm.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialdrivemm.R;

import java.util.ArrayList;

import model.Marker;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {

    Context context;
    ArrayList<Marker> markerArrayList;

    public ListaAdapter(Context context, ArrayList<Marker> markerArrayList) {
        this.context = context;
        this.markerArrayList = markerArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_marcador,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Marker marker = markerArrayList.get(position);

        holder.nombre.setText(marker.getNombre());
        holder.ubicacion.setText(marker.getUbicacion());
        holder.descripcion.setText(marker.getDescripcion());
        holder.icono.setImageResource(marker.getImgMarcador());

    }

    @Override
    public int getItemCount() {
        return markerArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre,ubicacion,descripcion;
        private ImageView icono;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.nombreMarcador);
            ubicacion = (TextView) itemView.findViewById(R.id.ubicMarcador);
            descripcion = (TextView) itemView.findViewById(R.id.descMarcador);

            icono = (ImageView) itemView.findViewById(R.id.imageMarcador);

        }
    }

}
