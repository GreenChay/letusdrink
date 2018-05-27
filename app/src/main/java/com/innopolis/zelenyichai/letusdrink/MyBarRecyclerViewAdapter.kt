package com.innopolis.zelenyichai.letusdrink

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.innopolis.zelenyichai.letusdrink.BarFragment.OnListFragmentInteractionListener
import com.innopolis.zelenyichai.letusdrink.dummy.DummyContent.DummyItem

import kotlinx.android.synthetic.main.fragment_bar.view.*

class MyBarRecyclerViewAdapter(
        private val mValues: List<BarModel>,
        private val mListener: OnListFragmentInteractionListener?)
    : RecyclerView.Adapter<MyBarRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as BarModel
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onListFragmentInteraction(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_bar, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        //holder.barNameView.text = item.name
        //holder.barDescriptionView.text = item.description

        with(holder.view) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val barNameView = view.tv_bar_name_collapsed
        val barDescriptionView = view.tv_bar_description_collapsed


        override fun toString(): String {
            return super.toString() + " '" + barNameView.text + barDescriptionView.text + "'"
        }
    }
}
