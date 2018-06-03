package com.innopolis.zelenyichai.letusdrink.Activities

import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.TabLayout
import android.support.v4.view.PagerAdapter
import android.support.v7.app.AppCompatActivity
import com.innopolis.zelenyichai.letusdrink.Adapters.BarPagerAdapter
import com.innopolis.zelenyichai.letusdrink.R
import kotlinx.android.synthetic.main.fragment_bar_card.*

class TestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_bar_card)

        val tabLayout = tablayout_bar_card
        tabLayout.addTab(tabLayout.newTab().setText("INFO"))
        tabLayout.addTab(tabLayout.newTab().setText("MENU"))
        tabLayout.addTab(tabLayout.newTab().setText("BAR"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL;

        val viewPager = view_pager_bar_card
        val adapter = BarPagerAdapter(supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }
}