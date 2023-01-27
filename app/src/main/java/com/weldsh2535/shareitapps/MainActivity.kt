package com.weldsh2535.shareitapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.weldsh2535.shareitapps.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private  lateinit var binding:ActivityMainBinding
    private lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendMessage.setOnClickListener {
            val message = binding.tvMessage.text.toString()

            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("sendMessage",message)
            startActivity(intent)
        }

        binding.btnShareMessage.setOnClickListener {
            val message = binding.tvMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share It"))
        }

        binding.btnListView.setOnClickListener {
            val intent = Intent(this,NumberListActivity::class.java)
            startActivity(intent)
        }

       binding.btnGridView.setOnClickListener {
           val intent = Intent(this,ImageActivity::class.java)
           startActivity(intent)
       }


        // use arrayadapter and define an array
        //val arrayAdapter: ArrayAdapter<*>
       /* val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor",11
        )
*/
    /*    val listOfNumber = arrayListOf<Int>()
        var number = 0
        for (num in number.rangeTo(300) ){
            if(num % 2 == 0){
                listOfNumber.add(num)
            }
        }

        var mylistview = findViewById<ListView>(R.id.numberlist)
        val arrayAdapter1:ArrayAdapter<Int> = ArrayAdapter(this,android.R.layout.simple_list_item_1,listOfNumber)
        mylistview.adapter = arrayAdapter1

        // listView item click event implemenation
        mylistview.setOnItemClickListener { parent, view, postion, id ->
            val selected = parent.getItemAtPosition(postion)
          *//*  val total = parent.count.toString()
            val firstIndexItem = parent.firstVisiblePosition
            val lastIndexItem = parent.lastVisiblePosition
            Log.i("MyTag",selected.toString())
            Log.i("MyTag","Total ${total} ")
            Log.i("MyTag",firstIndexItem.toString())
            Log.i("MyTag",lastIndexItem.toString())*//*

            Toast.makeText(applicationContext,"The number is ${selected.toString()}",Toast.LENGTH_SHORT).show()
        }*/

        // access the listView from xml file
   /*     var mListView = findViewById<ListView>(R.id.userlist)
       val arrayAdapter:ArrayAdapter<*> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter*/
    }


}