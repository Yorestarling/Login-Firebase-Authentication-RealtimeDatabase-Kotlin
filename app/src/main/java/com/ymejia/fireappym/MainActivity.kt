package com.ymejia.fireappym

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.database.FirebaseDatabase
import com.ymejia.fireappym.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.BtnLogIn.setOnClickListener{
            val showLog = Intent(Intent(this,LoginActivity::class.java))
            startActivity(showLog)
        }

        binding.BtnRegister.setOnClickListener{
            val showReg = Intent(Intent(this,RegisterActivity::class.java))
            startActivity(showReg)
        }

    }
}