package com.example.myapplication2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var hrInicio: Long = 0;
    val t: Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado","creado")
        hrInicio = System.nanoTime();
        val miBotton: Button = findViewById(R.id.my_button)
        miBotton.text="nooooo"
        val mensaje : TextView = findViewById(R.id.my_text)
        mensaje.text="hola"

    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onResume")
    }
    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onResume")
        val hFinal = System.nanoTime()
        val t: Long = (hFinal - hrInicio)/1000000000
        val tiempo: TextView = findViewById(R.id.my_time)
        tiempo.text= "La aplicacion se ejecuto $t seg antes de pausarla"
        Log.d("Estado","$t")

    }


}
