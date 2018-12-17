package com.example.rocka.app1.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.rocka.app1.Adaptors.HobbiesAdaptor
import com.example.rocka.app1.R
import com.example.rocka.app1.Models.supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setRecyclerView()
    }

    private fun setRecyclerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdaptor(this, supplier.hobbies)
        recyclerView.adapter = adapter
    }
}