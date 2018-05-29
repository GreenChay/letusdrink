package com.innopolis.zelenyichai.letusdrink.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import com.innopolis.zelenyichai.letusdrink.Fragments.BarFragment
import com.innopolis.zelenyichai.letusdrink.Models.BarModel
import com.innopolis.zelenyichai.letusdrink.R

class StartActivity : AppCompatActivity(), BarFragment.OnListFragmentInteractionListener {

    lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        toolbar = supportActionBar!!
        toolbar.hide()
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
    }

    override fun onListFragmentInteraction(item: BarModel?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
