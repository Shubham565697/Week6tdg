package com.xrest.week6.Class

import androidx.fragment.app.Fragment
import com.example.softuser.Fragments.HomeFragments
import com.xrest.weeksoft.ui.home.Adapter


var person:ArrayList<Person> = ArrayList()
var adapter = Adapter(person, HomeFragments())
var icons = ArrayList<Int>();
var st: ArrayList<Fragment> = ArrayList()
var a = arrayOf("25a","25b","25c")


fun add(){


    person.add(Person("Nima","Lama","25a","M","Balaju, Naya Bazar","https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png"))
    person.add(Person("Sushil","Shrestha","25b","F","Kapan","https://img.pngio.com/female-png-clipart-images-gallery-for-free-download-myreal-clip-female-png-612_710.png"))
    person.add(Person("Jenish","Shrestha","25c","M","Bhaktapur","https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png"))


}

