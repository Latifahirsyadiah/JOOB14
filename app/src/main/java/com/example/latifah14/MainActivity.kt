package com.example.latifah14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Busana  = findViewById<Button>(R.id.btnBusana)
        val Kuliner = findViewById<Button>(R.id.btnKuliner)
        val Pplg    = findViewById<Button>(R.id.btnPplg)
        val Tpfl    = findViewById<Button>(R.id.btnTpfl)
        val To      = findViewById<Button>(R.id.btnTo)


        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, busana())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,kuliner())
            fragmentTransaction.commit()
        }

        Pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,pplg())
            fragmentTransaction.commit()
        }

        Tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,kuliner())
            fragmentTransaction.commit()
        }

        To.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,to())
            fragmentTransaction.commit()
        }
    }

}