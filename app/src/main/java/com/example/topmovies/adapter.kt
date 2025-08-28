package com.example.dogsapp_recyclerview_kotlin
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.topmovies.R
import com.example.topmovies.movie
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(val activity: Activity,  private val list: ArrayList<movie>) :
    RecyclerView.Adapter<MyAdapter.MVH>() {


    class MVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val parent: CardView = itemView.findViewById(R.id.parent)
        val iv: ImageView = itemView.findViewById(R.id.image)
        val tv: TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MVH {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MVH(itemView)
    }

    override fun onBindViewHolder(holder: MVH, position: Int) {
        val currentItem = list[position]
        holder.iv.setImageResource(currentItem.pic)
        holder.tv.text = currentItem.name

        holder.parent.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW , currentItem.link.toUri() )
            activity.startActivity(i)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }





}