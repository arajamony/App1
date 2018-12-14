package com.example.rocka.app1

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*
import java.text.FieldPosition
import kotlin.contracts.Returns


class HobbiesAdaptor(val context:Context,val hobbies:List<Hobby>):RecyclerView.Adapter<HobbiesAdaptor.myViewHolder>(){

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

        fun SetData(hobby:Hobby?,Pos:Int) {
            itemView.txvTitle.text = hobby!!.title
        }
    }
}