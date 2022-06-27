package com.jnu.todolistapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jnu.todolistapp.databinding.ListItemTodoBinding
import com.jnu.todolistapp.model.TodoInfo
import timber.log.Timber

class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    private  var lstTodo : ArrayList<TodoInfo>  = ArrayList() // TodoInfo 클래스 안에있는 모델이 있는 배열생성

    init {
        // 리스트 아이템 인스턴스 생성
        val todoItem2 = TodoInfo()
        todoItem2.todoContent = "가가가가가가가가"
        todoItem2.todoDate = "2022-06-01 22:23"
        lstTodo.add(todoItem2)

        // 리스트 아이템 인스턴스 생성
        val todoItem = TodoInfo()
        todoItem.todoContent = "나나나나나나나나"
        todoItem.todoDate = "2022-06-01 22:23"
        lstTodo.add(todoItem)

        // 리스트 아이템 인스턴스 생성
        val todoItem3 = TodoInfo()
        todoItem3.todoContent = "다다다다다다다"
        todoItem3.todoDate = "2022-06-01 22:23"
        lstTodo.add(todoItem3)
    }

    class TodoViewHolder(private val binding: ListItemTodoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(todoItem: TodoInfo) {
            // 리스트 뷰 데이터를 UI 에 연동
            binding.tvContent.setText(todoItem.todoContent)
            binding.tvDate.setText(todoItem.todoDate)

            // 리스트 삭제 버튼 클릭 연동
            binding.btnRemove.setOnClickListener {
                // 쓰래기통 이미지 클릭 시 내부 로직 수행

            }
        }
    }

    // 어뎁터 생명주기

    // 뷰홀더가 생성됨. (각 리스트 아이템 1개씩 구성될 때마다 이 오버라이드 메소드가 호출 됨.)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoAdapter.TodoViewHolder {
        val binding = ListItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)



    }

    // 뷰홀더가 바인딩 (결합) 이루어질 때 해줘야 될 처리들을 구현
    override fun onBindViewHolder(holder: TodoAdapter.TodoViewHolder, position: Int) {
        holder.bind(lstTodo[position])

    }

    // 리스트 총 갯수
    override fun getItemCount(): Int {
        return lstTodo.size

    }

}