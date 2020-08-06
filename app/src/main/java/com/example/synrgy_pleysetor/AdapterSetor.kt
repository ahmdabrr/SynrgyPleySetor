package com.example.synrgy_pleysetor

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.synrgy_pleysetor.AdapterSetor.*
import kotlinx.android.synthetic.main.app_setor.view.*

class AdapterSetor (val listAplikasi : ArrayList<AppSetor>): RecyclerView.Adapter<AdapterSetor.ViewHolder>() {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.app_setor, parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAplikasi.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var logoAplikasi = holder.itemView.ivImgAppSetor

        Glide.with(holder.itemView.context)
            .load(listAplikasi[position].logo)
            .transform(RoundedCorners(60))
            .into(logoAplikasi)

        holder.itemView.tvNamaApp.setText(listAplikasi[position].nama)
        holder.itemView.tvSizeApp.setText("${listAplikasi[position].ukuran.toString()}MB")
    }
}