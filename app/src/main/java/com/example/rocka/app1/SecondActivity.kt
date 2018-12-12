package com.example.rocka.app1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle?=intent.extras
        val msg= bundle!!.getString("User_Message")

        lblUserMessage.text=msg
    }
}