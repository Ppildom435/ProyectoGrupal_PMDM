package com.example.socialdrivemm.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.socialdrivemm.R;

import java.util.ArrayList;
import java.util.List;

import model.Marker;

public class Info_Activity extends Fragment {

    private ArrayList<Marker> markerArrayList;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_info, container, false);

        recyclerView = (RecyclerView) vista.findViewById(R.id.recyclerMarcadores);

        return vista;

    }

    /*
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        obtenerMarcador();

        recyclerView = view.findViewById(R.id.recyclerMarcadores);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setHasFixedSize(true);

        ListaAdapter listaAdapter = new ListaAdapter(getContext(),markerArrayList);
        recyclerView.setAdapter(listaAdapter);
        listaAdapter.notifyDataSetChanged();
    }


    public List<Marker> obtenerMarcador(){
        List<Marker> marcador = new ArrayList<>();

        marcador.add(new Marker("Helicóptero","Alcalá de Guadaíra","Helicoptero en SE-30",R.drawable.helicoptero));

        return marcador;
    }
     */
}
