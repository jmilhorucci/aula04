package com.example.aula04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usuario = findViewById<EditText>(R.id.edtUsuario)
        var senha = findViewById<EditText>(R.id.edtSenha)
        var btnLoginCadastro = findViewById<Button>(R.id.btnCadastro)
        var btnEntrar = findViewById<Button>(R.id.btnEntrar)
        btnLoginCadastro.setOnClickListener(){
            var i = Intent(this, activity_cadastro::class.java).apply{

            }
            startActivity(i)
        }
        btnEntrar.setOnClickListener(){
            var i = Intent(this, activity_perfil::class.java).apply{

            }
            startActivity(i)
        }
    }
}