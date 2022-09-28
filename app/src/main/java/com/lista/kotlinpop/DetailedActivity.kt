package com.lista.kotlinpop

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.lista.kotlinpop.model.User

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_layout)

        val user = intent.getParcelableExtra<User>("user")
        if (user != null) {
            val textView: TextView = findViewById(R.id.card_view)
            val imageView: ImageView =findViewById(R.id.perfil_imagem)

            imageView.setImageResource(user.perfilImagem)
            textView.text = user.titulo
            textView.text = user.descricao
            textView.text = user.nome
            textView.text = user.sobrenome

        }

    }
}