package com.example.postdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ContextMenuDel : AppCompatActivity() {

    private var itemList = arrayOf("Item 1", "Item 2", "Item3")
    private var listView = ListView(null)
    private var arrayAdapter : ArrayAdapter<String> ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu_del)

        listView= findViewById(R.id.context_list_view)
        arrayAdapter = ArrayAdapter(applicationContext , android.R.layout.simple_list_item_1, itemList)
        listView.adapter = arrayAdapter
        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.main_menu, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.menu_call->{
                Toast.makeText(applicationContext, "Call Menu" , Toast.LENGTH_LONG).show()

                return true
            }
            R.id.menu_phone->{
                Toast.makeText(applicationContext, "Call Phone" , Toast.LENGTH_LONG).show()

                return true
            }
            R.id.menu_message->{
                Toast.makeText(applicationContext, "Call Message" , Toast.LENGTH_LONG).show()

                return true
            }
            else->return super.onContextItemSelected(item)
        }

    }
}