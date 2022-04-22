package com.example.utsnative_alatmusik_tradisional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMusikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_musik)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val musik = intent.getParcelableExtra<musik>(MainActivity.INTENT_PARCELABLE)

        val imgMusik = findViewById<ImageView>(R.id.img_item_photo)
        val nameMusik = findViewById<TextView>(R.id.tv_item_name)
        val descMusik = findViewById<TextView>(R.id.tv_item_description)

        imgMusik.setImageResource(musik?.imgMusik!!)
        nameMusik.text = musik.nameMusik
        descMusik.text = musik.descMusik
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}