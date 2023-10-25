package com.example.restauranteapp.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.restauranteapp.R


class InicioActivity : AppCompatActivity() {

    private lateinit var ivBack:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        val ivMesa1=findViewById<ImageView>(R.id.ivMesa1)
        ivMesa1.setOnClickListener { navigateToMesa1() }
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        ivBack=findViewById(R.id.ivBack)
    }

    private fun initListeners() {
        ivBack.setOnClickListener { onBackPressed() }
    }

    private fun navigateToMesa1() {
        val intent= Intent(this,ComandaActivity::class.java)
        startActivity(intent)
    }


}