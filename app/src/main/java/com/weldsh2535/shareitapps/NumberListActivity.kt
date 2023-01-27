package com.weldsh2535.shareitapps

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.weldsh2535.shareitapps.databinding.ActivityListviewBinding

class NumberListActivity:AppCompatActivity() {

    private lateinit var binding: ActivityListviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfNumber = arrayListOf<Int>()
        var number = 0
        for (num in number.rangeTo(300)){
            if (num % 2 == 0){
                listOfNumber.add(num)
            }
        }
        val arrayListNumber:ArrayAdapter<Int> = ArrayAdapter(this,android.R.layout.simple_list_item_1,listOfNumber)

        binding.listNumber.adapter =  arrayListNumber
       binding.listNumber.setOnItemClickListener { parent, view, position, l ->
           val selectedItemId = parent.getItemIdAtPosition(position)
           val selectedItem = parent.getItemAtPosition(position)
           Toast.makeText(this@NumberListActivity,"The Number is $selectedItem",Toast.LENGTH_LONG).show()
       }
    }
}