package com.example.buton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    var x = 0

    fun arttir(view : View){

        x++

        sayac.text = x.toString()

    }
    fun azalt(view : View){

        x--

        sayac.text = x.toString()

    }
    fun sifirla(view : View){

        x = 0

        sayac.text = x.toString()
    }

}