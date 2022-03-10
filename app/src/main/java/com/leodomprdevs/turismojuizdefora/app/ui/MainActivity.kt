package com.leodomprdevs.turismojuizdefora.app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.leodomprdevs.turismojuizdefora.R
import com.leodomprdevs.turismojuizdefora.app.ui.adapter.ListaDeTurismoAdapter
import com.leodomprdevs.turismojuizdefora.app.dao.DAO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_TurismoJuizDeFora)// Setando tema principal
        setContentView(R.layout.activity_main)
        Thread.sleep(1000) //Atrasando a inicialização do tema principal
        val dao = DAO()

        val recyclerViewDeTurismo = findViewById<RecyclerView>(R.id.lista_de_turismo)
        recyclerViewDeTurismo.adapter = ListaDeTurismoAdapter(this, dao.entregLista())


    }




}