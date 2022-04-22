package com.example.utsnative_alatmusik_tradisional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MusikList = listOf<musik>(
            musik(
                R.drawable.angklung,
                "Angklung",
                " Alat musik angklung yang berasal dari daerah Jawa barat yang mempunyai jenis bunyi Ideofon. Cara memainkan angkul ini dengan menggunakan tangan kita atau menggerakan tangan kita sesuai alunan nada."
            ),
            musik(
                R.drawable.kecapi,
                "Kecapi",
                " Alat musik kecapi yang berasal dari Sulawesi Barat. Alat ini mempunyai jenis ciri bunyi Kordofon. Cara untuk memainkannya alat ini sendiri dengan dipetik di bagian senarnya."
            ),
            musik(
                R.drawable.accordion,
                "Accordion",
                " Alat musik accoridon yang berasal dari Sumatera Selatan. Alat ini mempunyai jenis bunyi Aerofon, yaitu jenis bunyi yang berasal dari hembusan nafas. Cara menggunakan accordion yaitu dengan ditiup dan memakang kedua tangan untuk mengatur alunan nada."
            ),
            musik(
                R.drawable.seruling,
                "Seruling",
                " Alat musik saluang yang berasal dari  Minangkabau, Sumatera Barat. Alat musik ini mempunyai jenis bunyi Aerofon, yaitu bunyi yang berasal dari hembusan angin. Cara menggunakan alat musik saluang ini dengan ditiup dan lubang di salung sendiri digunakan untuk mengatur nada dan jari-jari tangan kita berfungsi untuk menutup lubangnya agar nada bisa di dapat sesuai kebutuhan."
            ),
            musik(
                R.drawable.rebab,
                "Rebab",
                " Alat musik rebab yang berasal dari Jawa Barat. Cara memainkannya alat ini seperti biola dengan car di gesek-gesek. Bentuk rebab ini seperti busur panah."
            ),
            musik(
                R.drawable.sasando,
                "Sasando",
                "Alat musik sasando yang berasal dari Nusa Tenggara Timur. Alat musik ini mempunyai jenis bunyi Chordofon. Cara memainkannya alt ini dengan dipetik."
            ),
            musik(
                R.drawable.kolintang,
                "Kolintang",
                " Alat musik kolintang yang berasal dari Sulawesi Utara. Alat ini mempunyai jenis bunyi Ideofon. Cara memainkannya dengan dipukul menggunakan pukulan khusus."
            ),
            musik(
                R.drawable.fu,
                "FU",
                " Alat musik FU yang berasal dari Maluku Utara. Alat ini mempunyai jenis ciri bunyi Aerofon. Cara untuk memainkannya sendiri dengan ditiup."
            ),
            musik(
                R.drawable.gambus,
                "Icona",
                " Alat musik gambus yang berasal dari Riau. Alat musik ini membunyai jenis bunyi Kordofun, yaitu bunyi yang berasal dari dawai atau senar. Alat musik gambus sendiri mempunyai 3 senar – 12 senar. Gambus umunya biasa dimainkan sambil diiringi gendang."
            ),
            musik(
                R.drawable.gong,
                "Gong",
                " Alat musik gong yang berasal dari Jawa Barat. Alat ini jika dipukul akan mengeluarkan jenis bunyi Membranofon. Gong biasanya  digantung dan diikat pada kayu."
            ),


            )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_musik)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusikAdapter(this, MusikList){
            val intent = Intent(this,DetailMusikActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}