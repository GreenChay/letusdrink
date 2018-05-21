package com.innopolis.zelenyichai.letusdrink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.innopolis.zelenyichai.letusdrink.dummy.DummyContent

class StartActivity : AppCompatActivity(), BarFragment.OnListFragmentInteractionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        Toast.makeText(this, item?.content, Toast.LENGTH_SHORT).show()
    }
}
