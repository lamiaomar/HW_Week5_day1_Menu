package com.example.hw_week5_day1_menu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_week5_day1_menu.model.contact
import com.example.hw_week5_day1_menu.model.setting
var x = true
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
                true
            }
            R.id.action_switch_layout4 -> {
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu? ): Boolean {

       var login =  menu?.findItem(R.id.action_switch_layout3)
       var logout = menu?.findItem(R.id.action_switch_layout4)

        if(x)
        { x =! x
            logout?.setVisible(true)
            login?.setVisible(false) }

        else  { x =! x
            login?.setVisible(true)
            logout?.setVisible(false) }

        return super.onPrepareOptionsMenu(menu)
    }

    }
