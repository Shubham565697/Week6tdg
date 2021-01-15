package com.example.softuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.softuser.Fragments.HomeFragments
import com.example.softuser.Fragments.Student_Details
import com.example.softuser.Fragments.WebFragments
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.xrest.week6.Class.add

class Vies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vies)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val v:FrameLayout = findViewById(R.id.frame)

        add()
        makeCurrentFrag(HomeFragments())
        navView.setOnNavigationItemSelectedListener(){

            when(it.itemId)
            {
                R.id.navigation_home->{
                    makeCurrentFrag(HomeFragments())
                }

                R.id.navigation_dashboard->{
                    makeCurrentFrag(Student_Details())
                }
                R.id.navigation_notifications->{
                    makeCurrentFrag(WebFragments())
                }


            }

            true
        }





    }
    fun makeCurrentFrag(frag: Fragment)
    {
        supportFragmentManager.beginTransaction().apply{

            replace(R.id.frame,frag)
            addToBackStack(null)
            commit()

        }

    }



}
