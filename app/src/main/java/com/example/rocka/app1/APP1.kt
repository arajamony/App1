package com.example.rocka.app1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_app1.*


class APP1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app1)

        // Button Show Click Event
        btnShow.setOnClickListener {
            Log.i("App1","BtnShow Clicked")
            Toast.makeText(this,"Show button is clicked",Toast.LENGTH_SHORT).show()
        }

        // Button Send Data to Next Activity Click Event
        btnSendDatatoNextActivity.setOnClickListener {

            val Message: String = txtUserMessage.text.toString()
            Toast.makeText(this, Message, Toast.LENGTH_SHORT).show()

            // Used to Navigate from one screen to Other , this is Eplicit Intent
            val intent = Intent(this, SecondActivity::class.java)
            //It is used to Pass value from this screen to Other screen
            intent.putExtra("User_Message",Message)
            startActivity(intent)
        }

    }



}
