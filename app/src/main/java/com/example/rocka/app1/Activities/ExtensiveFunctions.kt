package com.example.rocka.app1.Activities

import android.content.Context
import android.widget.Toast

fun Context.ShowMessage(Message:String) {
    Toast.makeText(this, Message, Toast.LENGTH_SHORT).show()
}
