package com.example.mappsapp

data class station(
    val coordonnées: String,
    val id: Int,
    val nom: String,
    val sous_nom: String,
    val type: String,
    val fer: Boolean,
    val tram: Boolean,
    val rer: Boolean,
    val train: Boolean,
    val metro: Boolean,
    val navette: Boolean,
    val nom_ligne: String,
    val id_ligne: Int,
    //icon_station

) : java.io.Serializable