package com.weldsh2535.shareitapps

import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.weldsh2535.shareitapps.databinding.ActivityImageBinding

class ImageActivity:AppCompatActivity() {

    private lateinit var binding: ActivityImageBinding

    private val itemList:Array<String>
    get() = arrayOf("Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",
        "Item 1","Item 2",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupGridView()
    }
    private fun setupGridView(){
        val adapter = ImageListAdapter(this, R.layout.list_item,itemList)
        binding.gridView.adapter = adapter

        binding.gridView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this@ImageActivity,"Clicked Position: "+(position+1),Toast.LENGTH_SHORT).show()
        }
    }
}