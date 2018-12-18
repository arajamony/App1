package com.example.rocka.app1.Adaptors

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.rocka.app1.Activities.ShowMessage
import com.example.rocka.app1.Models.Hobby
import com.example.rocka.app1.R
import kotlinx.android.synthetic.main.list_item.view.*


class HobbiesAdaptor(val context:Context,private val hobbies:List<Hobby>):RecyclerView.Adapter<HobbiesAdaptor.myViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.SetData(hobby, position)
    }

    inner class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var currentHobby: Hobby?=null
        var currentPosition:Int =0

        init {
            itemView.setOnClickListener {
                context.ShowMessage(currentHobby!!.title)
            }

            itemView.imgShare.setOnClickListener {
                val message: String = "My Hobby is " + currentHobby!!.title
                val intent = Intent()

                intent.action = Intent.ACTION_SEND

                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent, "Share to: "))
            }
        }

        fun SetData(hobby: Hobby?, Pos:Int) {
            itemView.txvTitle.text = hobby!!.title
            this.currentHobby = hobby
            this.currentPosition = Pos
        }
    }
}
