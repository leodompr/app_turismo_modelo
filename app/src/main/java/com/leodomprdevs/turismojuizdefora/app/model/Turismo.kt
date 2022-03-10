package com.leodomprdevs.turismojuizdefora.app.model

import com.google.android.gms.maps.model.LatLng
import java.io.Serializable
// CLASSE  MODEL//
data class Turismo (
    val local: String,
    val datas:String,
    val horas: String,
    val valor: String,
    val avaliacao: String,
    val imagem:String? = null,
    val localInformacao :String,
    val cordenadas: LatLng,
    val endereco: String,
    val url: String,
    val descricao : String

) :  Serializable


