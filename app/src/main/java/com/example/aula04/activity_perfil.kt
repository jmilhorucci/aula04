package com.example.aula04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val mUsuario = intent.getStringExtra("conteudoUsuario")
        val usuario = findViewById<TextView>(R.id.txtConteudoUsuario)
        usuario.text = mUsuario

        val mEmail = intent.getStringExtra("conteudoEmail")
        val email = findViewById<TextView>(R.id.txtConteudoEmail)
        email.text = mEmail

        val mNome = intent.getStringExtra("conteudoNome")
        val nome = findViewById<TextView>(R.id.txtConteudoNome)
        nome.text = mNome
    }
}