package com.weldsh2535.shareitapps

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.weldsh2535.shareitapps.Adapter.FlowerAdapter
import com.weldsh2535.shareitapps.Model.Flower
import com.weldsh2535.shareitapps.databinding.ActivityFlowerBinding

class FlowerActivity:AppCompatActivity() {

    private lateinit var binding: ActivityFlowerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlowerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
    }
    private fun setupRecyclerView(){
        binding.recyclerView.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = FlowerAdapter(createFlowerList()){ flower, position ->
                Toast.makeText(this@FlowerActivity,"Clicked on flower: ${flower.name}",Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun createFlowerList():ArrayList<Flower>{
        return arrayListOf(
            Flower("Blue Bell",R.drawable.blue1),
            Flower("Blue Red",R.drawable.blue21),
            Flower("Blue ",R.drawable.blue23),
            Flower("Blue green",R.drawable.blue4),
            Flower("Blue yellow",R.drawable.blue231),
            Flower("Blue white",R.drawable.bule2),
            Flower("red ",R.drawable.blue6),
            Flower("red white",R.drawable.bule23),
            Flower("red yellow",R.drawable.blue4),
            Flower("red green",R.drawable.b1),
            Flower("Yellow brown",R.drawable.b2),
            Flower("red blue ",R.drawable.b3),
            Flower("Blue brown",R.drawable.b4),
            Flower("Blue black",R.drawable.b5),
            Flower("Green ",R.drawable.b7),
            Flower("Green white",R.drawable.b8),
            Flower("Green Bell",R.drawable.c1),
            Flower("Yellow ",R.drawable.c2),
            Flower("Yellow white",R.drawable.b6),
            Flower("flower 8",R.drawable.flower1),
            Flower("flower 7",R.drawable.flower2),
            Flower("flower 6 ",R.drawable.flower3),
            Flower("flower 5",R.drawable.flower4),
            Flower("flower 3",R.drawable.flower5),
            Flower("flower 4",R.drawable.flower6),
            Flower("flower 2",R.drawable.flower7),
            Flower("flower 1",R.drawable.flower8),
            Flower("flower 9",R.drawable.flower9),
            Flower("flower 10",R.drawable.flower10),
            Flower("flower 11",R.drawable.flower11),
            Flower("flower 12",R.drawable.flower12),
            Flower("flower 13",R.drawable.flower13),
            Flower("flower 14 ",R.drawable.flower14),
            Flower("flower 15",R.drawable.flower15),
        )
    }
}