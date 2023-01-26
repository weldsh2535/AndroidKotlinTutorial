package com.weldsh2535.shareitapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.weldsh2535.shareitapps.databinding.ActivitySecondBinding

class SecondActivity:AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle:Bundle? =  intent.extras
        val receiveMessage = bundle!!.getString("sendMessage")
        binding.tvRecieveMessage.text = receiveMessage

    }
}