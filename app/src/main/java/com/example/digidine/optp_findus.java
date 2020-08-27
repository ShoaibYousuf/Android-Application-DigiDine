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

public class optp_findus extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList = new ArrayList<LatLng>();
    LatLng OPTPsaddar = new LatLng(33.598012,  73.050122);
    LatLng OPTPscheme3 = new LatLng(33.587251,  73.088831);
    LatLng OPTPciviccentre= new LatLng(33.550640,  73.122648);
    LatLng OPTPsatellitetown= new LatLng(33.639288,  73.069605);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optp_findus);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(OPTPsaddar);
        arrayList.add(OPTPscheme3);
        arrayList.add(OPTPciviccentre);
        arrayList.add(OPTPsatellitetown);
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
        LatLng OPTPsaddar = new LatLng(33.598012,  73.050122);
        mMap.addMarker(new MarkerOptions().position(OPTPsaddar).title("Marker in OPTP Saddar "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(OPTPsaddar,10F));

        LatLng OPTPscheme3 = new LatLng(33.587251,  73.088831);
        mMap.addMarker(new MarkerOptions().position(OPTPscheme3).title("Marker in OPTP Scheme 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(OPTPscheme3,10F));

        LatLng OPTPciviccentre= new LatLng(33.550640,  73.122648);
        mMap.addMarker(new MarkerOptions().position(OPTPciviccentre).title("Marker in OPTP Civic Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(OPTPciviccentre,10F));

        LatLng OPTPsatellitetown= new LatLng(33.639288,  73.069605);
        mMap.addMarker(new MarkerOptions().position(OPTPsatellitetown).title("Marker in OPTP Civic Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(OPTPsatellitetown,10F));


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