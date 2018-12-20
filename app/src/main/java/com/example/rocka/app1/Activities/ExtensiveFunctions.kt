package com.example.rocka.app1.Activities

import android.content.Context
import android.widget.Toast

fun Context.ShowMessage(Message:String,duration:Int=Toast.LENGTH_SHORT) {
    Toast.makeText(this, Message, duration).show()
}