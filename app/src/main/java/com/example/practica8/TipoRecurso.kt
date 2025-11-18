package com.example.practica8

enum class TipoRecurso(val tipo: String,val isotipo: Int) {
    LINK("Link",R.drawable.globo),
    AUDIO("Audiovisual",R.drawable.sonido),
    VIDEO("Video",R.drawable.reproductor_de_video),
    IMAGEN("Imagen",R.drawable.fotos),
    CARPETA("Carpeta",R.drawable.carpeta),
    OTRO("Otro",R.drawable.androide)

}