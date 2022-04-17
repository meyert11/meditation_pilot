package com.example.meditation_pilot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickme = findViewById<Button>(R.id.button3)

        clickme.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()

        }


    }
    fun playBell(view: android.view.View) {
        playAudio()

    }
    private fun playAudio() {
        mp = MediaPlayer.create(this, R.raw.short_bell)
        mp.setVolume(0.5f, 0.5f)
        mp.start()
    }

}