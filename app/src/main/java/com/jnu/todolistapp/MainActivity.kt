package com.jnu.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jnu.todolistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
            // lateinit : 늦은 초기화
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.setText("안녕하세요 박진우 입니다. ")
        binding.tvTest.setText("강의 완강 까지 파이팅. ")

        // findViewById 이전엔 이걸로 사용했지만 반복적인 코드작성을 줄이기위해 binding 이라는 게 탄생했다.

        // 엑티비티가 생성될 댸 호출되며 사용자 인터페이스 초기화 할 때 이곳에 구현.
        println("Jnu onCreate !!!")

    }

    override fun onStart() {
        super.onStart()
        // 엑티비티가 사용자에게 보여지기 직전에 호출 됨.

        println("Jnu onStart !!!")
    }

    override fun onResume() {
        super.onResume()
        // 액티비티 사용자랑 상호작용 하기 직전에 호출 (시작 or 재개 상태)

        println("Jnu onResume !!!")
    }

    override fun onPause() {
        super.onPause()
        // 다른 엑티비티가 보여지게 될때 호출됨. (중지 상태)

        println("Jnu onPause !!!")
    }

    override fun onStop() {
        super.onStop()
        // 엑티비티가 사용자에게 완전히 보여지지 않을 때 호출됨

        println("Jnu onStop !!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        // 엑티비티가 소멸(제거)될 때 호출 됨.

        println("Jnu onDestroy !!!")

    }

    override fun onRestart() {
        super.onRestart()
        // 엑티비티가 멈췄다가 다시 시작되기 전에 호출

        println("Jnu onRestart !!!")
    }
}


















