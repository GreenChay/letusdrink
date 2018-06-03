package com.innopolis.zelenyichai.letusdrink.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.innopolis.zelenyichai.letusdrink.Fragments.BarInfoFragment

class BarPagerAdapter(fm: FragmentManager?, var tabsNumber: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> {
                val barInfoFragment = BarInfoFragment()
                barInfoFragment
            }
            1 -> {
                val barInfoFragment = BarInfoFragment()
                barInfoFragment
            }
            2 -> {
                val barInfoFragment = BarInfoFragment()
                barInfoFragment
            }
            else -> null
        }
    }

    override fun getCount(): Int {
        return tabsNumber
    }
}