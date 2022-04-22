package com.example.utsnative_alatmusik_tradisional

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusikAdapter (private val context: Context, private val musik: List<musik>, val listener: (musik) ->Unit)
    : RecyclerView.Adapter<MusikAdapter.MusikViewHolder>(){

    class MusikViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgMusik = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMusik = view.findViewById<TextView>(R.id.tv_item_name)
        val descMusik = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(musik: musik, listener: (musik) -> Unit) {
            imgMusik.setImageResource(musik.imgMusik)
            nameMusik.text = musik.nameMusik
            descMusik.text = musik.descMusik
            itemView.setOnClickListener{listener(musik)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusikViewHolder {
        return MusikViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_musik,parent, false)
        )
    }

    override fun onBindViewHolder(holder: MusikViewHolder, position: Int) {
        holder.bindView(musik[position], listener)
    }

    override fun getItemCount(): Int = musik.size
}