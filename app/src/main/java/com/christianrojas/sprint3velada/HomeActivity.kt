package com.christianrojas.sprint3velada

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.christianrojas.sprint3velada.databinding.ActivityHomeBinding
import com.christianrojas.sprint3velada.ui.theme.DetailActivity
import kotlin.jvm.java

/*
PRINCIPIOS DE UI / UX Y ACCESIBILIDAD APLICADOS EN ESTA PANTALLA:
1. Fondo oscuro (#0F0F0F) con texto claro (#E0E0E0) y dorado (#E5B83B)
2. Elementos centrados en vertical, agrupando título, línea y subtítulo.
3. Botones grandes de 56dp de altura.
4. Accesibilidad:
   - Uso de unidades 'sp' en los textos y 'wrap_content' dentro de un ScrollView.
   - Atributo contentDescription en el ImageView para lectores de pantalla.
   - Atributo accessibilityHeading="true" en el título principal.
*/
class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMasInfo.setOnClickListener {
            Toast.makeText(this, "Todavía no está implementado", Toast.LENGTH_SHORT).show()
        }

       binding.btnVerCombates.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}