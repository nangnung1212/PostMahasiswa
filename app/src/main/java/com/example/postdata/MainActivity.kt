package com.example.postdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<ResponseItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnDelete = findViewById<Button>(R.id.btn_delete)
        BtnDelete.setOnClickListener {
            val Intent = Intent( this,ContextMenuDel::class.java)
            startActivity(Intent)
        }

        val GetDataBtn = findViewById<Button>(R.id.btn_get_data)
        GetDataBtn.setOnClickListener {
            val Intent = Intent(this,GetData::class.java)
            startActivity(Intent)
        }
    }
}



