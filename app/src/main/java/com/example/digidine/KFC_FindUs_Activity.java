package com.example.digidine;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class KFC_FindUs_Activity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng>arrayList = new ArrayList<LatLng>();
    LatLng KFCsaddar = new LatLng(33.596884, 73.052869);
    LatLng KFCscheme3 = new LatLng(33.591467,  73.094064);
    LatLng KFCciviccentre= new LatLng(33.553994,  73.126680);
    LatLng KFCsatellitetown= new LatLng(33.636641, 73.071405);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc_find_us_);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(KFCsaddar);
        arrayList.add(KFCscheme3);
        arrayList.add(KFCciviccentre);
        arrayList.add(KFCsatellitetown);
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
        LatLng KFCsaddar = new LatLng(33.596884, 73.052869);
        mMap.addMarker(new MarkerOptions().position(KFCsaddar).title("Marker in KFC Saddar "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KFCsaddar,10F));

        LatLng KFCscheme3 = new LatLng(33.591467,  73.094064);
        mMap.addMarker(new MarkerOptions().position(KFCscheme3).title("Marker in KFC Scheme 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KFCscheme3,10F));

        LatLng KFCciviccentre =new LatLng(33.553994, 73.126680);
        mMap.addMarker(new MarkerOptions().position(KFCciviccentre).title("Marker in KFC Civic Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KFCciviccentre,10F));

        LatLng KFCsatellitetown =new LatLng(33.636641, 73.071405);
        mMap.addMarker(new MarkerOptions().position(KFCsatellitetown).title("Marker in KFC Civic Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KFCsatellitetown,10F));


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