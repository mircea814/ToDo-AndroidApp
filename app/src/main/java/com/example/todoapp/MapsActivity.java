package com.frsarker.todotask;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng craiova = new LatLng(44.33818402454318, 23.772053718566898);
        mMap.addMarker(new MarkerOptions().position(craiova).title("Acasa" +
                ""));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(craiova));

        LatLng adina = new LatLng(44.31795304574349, 23.79673004150391);
        mMap.addMarker(new MarkerOptions().position(adina).title("Centru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(adina));

        LatLng parc = new LatLng(44.297254356378254, 23.80934715270996);
        mMap.addMarker(new MarkerOptions().position(parc).title("Parcul Nicolae Romanescu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(parc));

        LatLng mall = new LatLng(44.30751248270322, 23.830032348632816);
        mMap.addMarker(new MarkerOptions().position(mall).title("Electroputere Craiova"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mall));

        LatLng airport = new LatLng(44.31623355136435, 23.88874053955078);
        mMap.addMarker(new MarkerOptions().position(airport).title("Aeroportul International Craiova"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(airport));
    }
}