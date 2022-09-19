package com.example.comoponentex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tglBtn:ToggleButton = findViewById<ToggleButton>(R.id.toggle_theme)
        tglBtn.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { _, value ->
            if (value) {
                findViewById<LinearLayout>(R.id.root_content).setBackgroundResource(R.drawable.nigth)
            } else {
                findViewById<LinearLayout>(R.id.root_content).setBackgroundResource(R.drawable.day)
            }
        })
    }

    fun go_pages(view:View){
        var intent:Intent = Intent(this,PageActivity::class.java)
        startActivity(intent)
    }
    fun go_form(view:View){
        var intent:Intent = Intent(this,FormActivity::class.java)
        startActivity(intent)
    }
}