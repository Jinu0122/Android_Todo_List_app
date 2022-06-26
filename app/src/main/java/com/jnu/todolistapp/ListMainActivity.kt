package com.jnu.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jnu.todolistapp.adapter.TodoAdapter
import com.jnu.todolistapp.databinding.ActivityListMainBinding
import com.jnu.todolistapp.databinding.ActivityMainBinding

class ListMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListMainBinding
    private lateinit var todoAdapter : TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 어뎁터 인스턴스 생성
        todoAdapter = TodoAdapter()

        // 리사이클러뷰 어뎁터 세팅
        binding.rvTodo.adapter = todoAdapter
    }
}