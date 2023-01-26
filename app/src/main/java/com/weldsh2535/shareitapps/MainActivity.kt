package com.weldsh2535.shareitapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.weldsh2535.shareitapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSendMessage.setOnClickListener {
            val message = binding.tvMessage.text.toString()

            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("sendMessage",message)
            startActivity(intent)
        }
    }
}