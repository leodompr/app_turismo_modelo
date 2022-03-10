package com.leodomprdevs.turismojuizdefora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MarkerOptions
import com.leodomprdevs.turismojuizdefora.app.dao.DAO
import com.leodomprdevs.turismojuizdefora.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(){

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    val turismo = DAO()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        turismo.entregLista()

        mapFragment.getMapAsync{ googleMap ->
            addMarkers(googleMap)
        }


    }

  fun addMarkers(googleMap: GoogleMap) {
      turismo.entregLista().forEach { turismos ->
          val marker = googleMap.addMarker(
              MarkerOptions()
                  .title(turismos.localInformacao)
                  .snippet(turismos.endereco)
                  .position(turismos.cordenadas)
                  
          )
      }


  }}



