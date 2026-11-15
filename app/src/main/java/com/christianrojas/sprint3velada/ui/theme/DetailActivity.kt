package com.christianrojas.sprint3velada.ui.theme

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.christianrojas.sprint3velada.R
import com.christianrojas.sprint3velada.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardCombate1.titulo = "Combate Estelar"
        binding.cardCombate1.subtitulo = "Peso Pesado • 3 Asaltos"
        binding.cardCombate1.descripcion = "El enfrentamiento más esperado de toda La Velada del Año 2027."
        binding.cardCombate1.textoBoton = "Ver estadísticas"
        binding.cardCombate1.setImagen(R.drawable.logo_velada, "Cartel del combate estelar")
        binding.cardCombate1.setOnAccionClickListener {
            Toast.makeText(this, "Abriendo estadísticas del Combate Estelar", Toast.LENGTH_SHORT).show()
        }

        binding.cardCombate2.titulo = "Combate Co-Estelar"
        binding.cardCombate2.subtitulo = "Peso Medio • 3 Asaltos"
        binding.cardCombate2.descripcion = "Duelo de alta velocidad entre dos grandes creadores."
        binding.cardCombate2.textoBoton = "Apostar favorito"
        binding.cardCombate2.setImagen(R.drawable.logo_velada, "Cartel del combate co-estelar")
        binding.cardCombate2.setOnAccionClickListener {
            Toast.makeText(this, "Voto registrado", Toast.LENGTH_SHORT).show()
        }
    }
}