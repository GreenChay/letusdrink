package com.innopolis.zelenyichai.letusdrink.Fragments

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.innopolis.zelenyichai.letusdrink.R

class BarInfoFragment(): Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_bar_info, container, false)
    }
}