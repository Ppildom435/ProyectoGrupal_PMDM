package com.example.socialdrivemm.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.socialdrivemm.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps_Activity extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_maps,container,false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SupportMapFragment sMap = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);

        if (sMap!=null){
            sMap.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        mMap = googleMap;

        LatLng radar = new LatLng(37.3754865, -6.025098);
        mMap.addMarker(new MarkerOptions().position(radar).title("Radar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(radar));

        LatLng heli = new LatLng(37.3335031,-5.8410213);
        mMap.addMarker(new MarkerOptions().position(heli).title("Helicóptero"));


    }
}
