package com.innopolis.zelenyichai.letusdrink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.innopolis.zelenyichai.letusdrink.dummy.DummyContent

class StartActivity : AppCompatActivity(), BarFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: BarModel?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

}
