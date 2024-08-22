package com.upb.myrestaurant;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.upb.myrestaurant.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        LatLng medellin = new LatLng( 6.25184, -75.56359);

        //Latitud Longitud Sedes
        LatLng laureles = new LatLng( 6.2419995,  -75.5958328);
        LatLng centro = new LatLng( 6.25184, -75.56359);
        LatLng poblado = new LatLng( 6.227259, -75.5719699);
        LatLng norte = new LatLng( 6.33732 , -75.55795);

        mMap.addMarker(new MarkerOptions().position(laureles).title("El Italiano: Sede Laureles")
                .snippet("El Verdadero Sabor Italiano")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-45.0f)
        );
        mMap.addMarker(new MarkerOptions().position(centro).title("El Italiano: Sede Centro")
                .snippet("El Verdadero Sabor Italiano")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-45.0f)
        );

        mMap.addMarker(new MarkerOptions().position(poblado).title("El Italiano: Sede Poblado")
                .snippet("El Verdadero Sabor Italiano")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-45.0f)
        );
        mMap.addMarker(new MarkerOptions().position(norte).title("El Italiano: Sede Norte")
                .snippet("El Verdadero Sabor Italiano")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-45.0f)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(medellin,12));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);



    }
}