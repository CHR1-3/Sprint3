package com.christianrojas.sprint3velada.ui.theme

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.christianrojas.sprint3velada.databinding.ViewMyCardBinding

class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var titulo: String
        get() = binding.txtCardTitulo.text.toString()
        set(value) {
            binding.txtCardTitulo.text = value
        }

    var subtitulo: String
        get() = binding.txtCardSubtitulo.text.toString()
        set(value) {
            binding.txtCardSubtitulo.text = value
        }

    var descripcion: String
        get() = binding.txtCardDescripcion.text.toString()
        set(value) {
            binding.txtCardDescripcion.text = value
        }

    var textoBoton: String
        get() = binding.btnCardAccion.text.toString()
        set(value) {
            binding.btnCardAccion.text = value
        }

    fun setImagen(resId: Int, descripcionImagen: String) {
        binding.imgCard.setImageResource(resId)
        binding.imgCard.contentDescription = descripcionImagen
    }

    fun setOnAccionClickListener(listener: () -> Unit) {
        binding.btnCardAccion.setOnClickListener {
            listener()
        }
    }
}