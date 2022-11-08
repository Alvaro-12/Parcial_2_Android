package com.example.parcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Fragmento : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var Especie = arrayOf<String>("GATO", "Ardilla voladora :)", "ZORRA")
        var Sexo = arrayOf<String>("Macho", "Macho", "Hembra")
        var Habitad = arrayOf<String>("Terrestre", "Aereo", "Terrestre")
        var imagenes = arrayOf(
            R.drawable.gato,
            R.drawable.ardilla,
            R.drawable.zorro
        )

        var imagenLista = arrayOf(
            ImgItems(imagenes.get(0), Especie.get(0), Sexo.get(0), Habitad.get(0)),
            ImgItems(imagenes.get(1), Especie.get(1), Sexo.get(1), Habitad.get(1)),
            ImgItems(imagenes.get(2), Especie.get(2), Sexo.get(2), Habitad.get(2)),
        )
 /*       override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_fragmento, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
                val tvEspecie:TextView = view.findViewById(R.id.tv_Especie)
                tvEspecie.text = "Vista Fragmento " + getInt(ARG_OBJECT).toString()

            }
        }

        companion object {
            private const val ARG_OBJECT = "object"
   */
    }


}
