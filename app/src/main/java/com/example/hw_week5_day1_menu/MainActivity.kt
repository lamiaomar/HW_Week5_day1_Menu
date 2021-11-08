package com.example.hw_week5_day1_menu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_week5_day1_menu.model.contact
import com.example.hw_week5_day1_menu.model.setting

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.layout_manu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.action_switch_layout2 -> {
                /*
                 val context = holder.buttonView.context
                    val intent = Intent(context, mobila::class.java)
                    intent.putExtra("iphone",context.resources.getString(item.productName))
                    context.startActivity(intent)
                 */
                val intent = Intent(this , setting::class.java)
                this.startActivity(intent)
                true
            }
            R.id.action_switch_layout -> {
                val intent = Intent(this , contact::class.java)
                this.startActivity(intent)
                true
            }
            R.id.action_switch_layout3 -> {
                if(item.title == "Log In") item.title = "Log Out"
                else if (item.title == "Log Out") item.title = "Log In"
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    }
