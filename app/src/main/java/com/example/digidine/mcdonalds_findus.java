package com.example.digidine;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class mcdonalds_findus extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList = new ArrayList<LatLng>();
    LatLng mcdonalds_bahria_phase7 = new LatLng(33.532918, 73.099961);
    LatLng mcdonalds_airport_road = new LatLng(33.589564,  73.072495);
    LatLng mcdonalds_giga_mall= new LatLng(33.526050,  73.157639);
    LatLng mcdonalds_DHA2= new LatLng(33.540931, 73.167252);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdonalds_findus);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(mcdonalds_bahria_phase7);
        arrayList.add(mcdonalds_airport_road);
        arrayList.add(mcdonalds_giga_mall);
        arrayList.add(mcdonalds_DHA2);
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
        LatLng mcdonalds_bahria_phase7  =new LatLng(33.532918, 73.099961);
        mMap.addMarker(new MarkerOptions().position(mcdonalds_bahria_phase7).title("Marker in McDonalds Bahria Town Phase 7"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mcdonalds_bahria_phase7,10F));

        LatLng mcdonalds_airport_road = new LatLng(33.589564,  73.072495);
        mMap.addMarker(new MarkerOptions().position(mcdonalds_airport_road).title("Marker in McDonalds Airport Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mcdonalds_airport_road,10F));

        LatLng mcdonalds_giga_mall= new LatLng(33.526050,  73.157639);
        mMap.addMarker(new MarkerOptions().position(mcdonalds_giga_mall).title("Marker in McDronalds Giga Mall"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mcdonalds_giga_mall,10F));

        LatLng mcdonalds_DHA2= new LatLng(33.540931, 73.167252);
        mMap.addMarker(new MarkerOptions().position(mcdonalds_DHA2).title("Marker in McDonalds DHA phase 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mcdonalds_DHA2,10F));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}