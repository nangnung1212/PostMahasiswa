package com.example.postdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import retrofit2.http.POST

class PostAdapter (val PostAdapter: ArrayList<ResponseItem>):
    RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var txtId : TextView
        lateinit var txtNama : TextView
        lateinit var txtNim : TextView
        lateinit var txtFoto : TextView
        lateinit var txtEmail : TextView
        lateinit var txtAlamat : TextView

        fun bind(responseItem: ResponseItem){
            with(itemView.apply {
                txtId = findViewById(R.id.id)
                txtNama = findViewById(R.id.nama)
                txtNim = findViewById(R.id.nim)
                txtFoto = findViewById(R.id.foto)
                txtEmail = findViewById(R.id.email)
                txtAlamat = findViewById(R.id.alamat)
            }){
                val text = "id : ${responseItem.id}\n" +
                        "nama : ${responseItem.nama}\n" +
                        "nim : ${responseItem.nim}\n" +
                        "foto : ${responseItem.foto}\n" +
                        "email : ${responseItem.email}\n" +
                        "alamat: ${responseItem.alamat}\n"
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(PostAdapter[position])
    }

    override fun getItemCount(): Int {
        return PostAdapter?.size ?: 0
    }
}