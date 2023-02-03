package com.weldsh2535.shareitapps.Adapter

import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.weldsh2535.shareitapps.R
import com.weldsh2535.shareitapps.databinding.ListItemBinding

class ImageListAdapter(
    context: Context,
    private val resource:Int,
    private val itemList:Array<String>?
):ArrayAdapter<ImageListAdapter.ItemViewHolder>(context , resource ) {
    private val inflater:LayoutInflater = LayoutInflater.from(context)
    private lateinit var itemBinding: ListItemBinding

    override fun getCount(): Int {
        return if (this.itemList != null) this.itemList.size else 0
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var convertView = view
        val holder: ItemViewHolder
        if (convertView == null){
            itemBinding = ListItemBinding.inflate(inflater)
            convertView = itemBinding.root
            holder = ItemViewHolder()
            holder.name = itemBinding.textView
            holder.icon = itemBinding.icon
            convertView.tag = holder
        } else{
            holder = convertView.tag as ItemViewHolder
        }
        holder.name!!.text = this.itemList!![position]
        holder.icon!!.setImageResource(R.mipmap.ic_launcher)
        return convertView
    }

    inner class ItemViewHolder{
        var name:TextView? = null
        var icon:ImageView? = null
    }
}