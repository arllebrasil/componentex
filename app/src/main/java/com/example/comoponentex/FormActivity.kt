package com.example.comoponentex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
import android.widget.Toast

class FormActivity : AppCompatActivity() {


    lateinit var paises:ArrayList<String>
    lateinit var faixas:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        paises = ArrayList()
        paises.add("Brasil")
        paises.add("Inglatera")
        paises.add("França")

        var paisesAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,paises)
        findViewById<AutoCompleteTextView>(R.id.paises).setAdapter(paisesAdapter)

        faixas = ArrayList()
        faixas.add("1 - 12 (anos)")
        faixas.add("13 - 20 (anos)")
        faixas.add("20 - 30 (anos)")
        faixas.add("31+")

        var faixasAdapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,faixas)
        findViewById<Spinner>(R.id.faixa_etaria).setAdapter(faixasAdapter)
    }

    fun subcribeClick(view:View){
        Toast.makeText(this,"Segure o botão para ativalo",Toast.LENGTH_LONG).show()
    }

    fun subcribe(){
        Toast.makeText(this,"Valores",Toast.LENGTH_LONG).show()
    }

}