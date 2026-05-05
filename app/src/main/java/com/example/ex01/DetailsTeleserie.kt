package com.example.ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsTeleserie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_teleserie)

        val titles = findViewById<TextView>(R.id.titles)
        titles.text = this.intent.getStringExtra("titles")

        val plots = findViewById<TextView>(R.id.plots)
        plots.text = this.intent.getStringExtra("plots")

        val genres = findViewById<TextView>(R.id.genres)
        genres.text = this.intent.getStringExtra("genres")

        val studios = findViewById<TextView>(R.id.studios)
        studios.text = this.intent.getStringExtra("studios")

    }
}