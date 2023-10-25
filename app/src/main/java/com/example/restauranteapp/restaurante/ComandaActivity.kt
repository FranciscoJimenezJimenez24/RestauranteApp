package com.example.restauranteapp.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.restauranteapp.R

class ComandaActivity : AppCompatActivity() {
    private lateinit var ivBack: ImageView
    private lateinit var ivHome: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comanda)
        initComponents()
        initListeners()
    }

    private fun initListeners() {
        //ivBack=findViewById(R.id.ivBack_comanda)
        ivHome=findViewById(R.id.ivHome)
    }

    private fun initComponents() {
        //ivBack.setOnClickListener {onBackPressed()}
        ivHome.setOnClickListener { navigateToInicio() }
    }

    private fun navigateToInicio() {
        val intent= Intent(this,InicioActivity::class.java)
        startActivity(intent)
    }


}