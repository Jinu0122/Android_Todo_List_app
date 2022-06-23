package com.jnu.todolistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.jnu.todolistapp.databinding.ActivityMainBinding
import com.jnu.todolistapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            startActivity(Intent(this, ListMainActivity::class.java)) // 지정한 액티비티 (화면)으로 이동
            finish() // 현재 엑티비티를 종료
        }, 1500)
    }
}