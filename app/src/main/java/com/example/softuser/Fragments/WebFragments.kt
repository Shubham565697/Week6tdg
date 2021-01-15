package com.example.softuser.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.softuser.R


class WebFragments : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var view= inflater.inflate(R.layout.fragment_web_fragments, container, false)
        var web: WebView = view.findViewById(R.id.web)
        web.loadUrl("https://softwarica.edu.np/")
        return view
    }
}