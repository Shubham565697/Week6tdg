package com.example.softuser.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.softuser.R
import com.xrest.week6.Class.adapter


class HomeFragments : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {



        val root = inflater.inflate(R.layout.fragment_home_fragments, container, false)
        var rv: RecyclerView = root.findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL,false)
        rv.adapter = adapter
        return root
    }
}