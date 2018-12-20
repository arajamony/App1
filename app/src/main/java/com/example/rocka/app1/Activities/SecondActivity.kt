package com.example.rocka.app1.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.rocka.app1.Models.Constants
import com.example.rocka.app1.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe Call Operator ?. Used to prevent from null pointer Exception
        //Safe Call and Let ?.let{} used to eecute the statement in the Let function when the object is not null.

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle.getString(Constants.User_MessageKey)
            lblUserMessage.text = msg
        }
    }
}