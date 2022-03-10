package com.leodomprdevs.turismojuizdefora.app.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import coil.load
import com.leodomprdevs.turismojuizdefora.R
import com.leodomprdevs.turismojuizdefora.app.model.Turismo
import java.io.Serializable

class TelaInformacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_informacao)

        val turismoLocal = intent.getStringExtra("turismoLocal")
        val turismoEndereco = intent.getStringExtra("turismoEndereco")
        val turismoDescricao = intent.getStringExtra("turismoDescricao")
        val turismoUrl = intent.getStringExtra("turismoUrl")
        val imagemUrl = intent.getStringExtra("imagemUrl")



        val textoNome = findViewById<TextView>(R.id.texto_nome_tela_informacao)
        val textoEndereco = findViewById<TextView>(R.id.texto_endereco_tela_informacao)
        val textoDescricao = findViewById<TextView>(R.id.texto_descricao_tela_informacao)
        val imagemDescricao = findViewById<ImageView>(R.id.imagem_tela_informacao)

        imagemDescricao.load(imagemUrl)
        textoNome.text = turismoLocal
        textoEndereco.text = turismoEndereco
        textoDescricao.text = turismoDescricao

        val btnMapa = findViewById<Button>(R.id.btnMapa)
        btnMapa.setOnClickListener {
            val irParaMapa = Intent(Intent.ACTION_VIEW, Uri.parse(turismoUrl))
            startActivity(irParaMapa)
        }




    }
}