package com.innopolis.zelenyichai.letusdrink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import android.widget.Toast
import com.innopolis.zelenyichai.letusdrink.dummy.DummyContent

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
