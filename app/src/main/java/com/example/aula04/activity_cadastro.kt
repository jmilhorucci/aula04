package com.example.aula04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class activity_cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val usuario = findViewById<EditText>(R.id.edtCadUsuario)
        var senha = findViewById<EditText>(R.id.edtCadSenha)
        var nome = findViewById<EditText>(R.id.edtCadNome)
        var email = findViewById<EditText>(R.id.edtCadEmail)
        var btnCadCadastrar = findViewById<Button>(R.id.btnCadastrar)
        btnCadCadastrar.setOnClickListener(){
            var i = Intent(this, activity_perfil::class.java).apply{
                putExtra("conteudoUsuario",usuario.text.toString())
                putExtra("conteudoEmail",email.text.toString())
                putExtra("conteudoNome",nome.text.toString())
            }
            startActivity(i)
        }
    }
}