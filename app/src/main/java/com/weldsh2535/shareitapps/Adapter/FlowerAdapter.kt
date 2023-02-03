package com.weldsh2535.shareitapps.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.weldsh2535.shareitapps.Model.Flower
import com.weldsh2535.shareitapps.databinding.FlowerItemBinding

class FlowerAdapter(
    private val flowerList:ArrayList<Flower>,
    private val listener:(Flower,Int) -> Unit
):RecyclerView.Adapter<FlowerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = FlowerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(flowerList[position])
        holder.itemView.setOnClickListener { listener(flowerList[position],position) }
    }

    override fun getItemCount(): Int {
        return flowerList.size
    }


    class ViewHolder(var flowerItemBinding: FlowerItemBinding):RecyclerView.ViewHolder(flowerItemBinding.root){
        fun bindItem(flower: Flower){
            flowerItemBinding.image.setImageResource(flower.image)
            flowerItemBinding.name.text = flower.name
        }
    }


}