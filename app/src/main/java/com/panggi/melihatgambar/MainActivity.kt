package com.panggi.melihatgambar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageView.setOnClickListener() {
            imageView2.setBackgroundColor(Color.GREEN)
            imageView.setBackgroundColor(Color.RED)
            Toast.makeText(this, "ini api", Toast.LENGTH_LONG).show()
        }

        imageView2.setOnClickListener() {
            imageView.setBackgroundColor(Color.GREEN)
            imageView2.setBackgroundColor(Color.RED)
            Toast.makeText(this, "ini Nokia", Toast.LENGTH_LONG).show()

        }
    }
}