package com.lista.kotlinpop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lista.kotlinpop.adapters.UserAdapter
import com.lista.kotlinpop.model.User


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User>
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        userList = ArrayList()

        userList.add(
            User(
                R.drawable.icone_perfil,
                "App teste1",
                "Lorem Ipsum",
                "Marcela",
                "Marcela Oliveira"
            )
        )

        userList.add(
            User(
                R.drawable.icone_perfil,
                "App teste2",
                "Lorem Ipsum",
                "Lucas",
                "Lucas Almeida"
            )
        )

        userList.add(
            User(
                R.drawable.icone_perfil,
                "App teste3",
                "Lorem Ipsum",
                "Luiza",
                "Luiza Castro"
            )
        )

        userList.add(
            User(
                R.drawable.icone_perfil,
                "App teste4",
                "Lorem Ipsum",
                "Nome Usuario",
                "Sobrenome Usuario"
            )
        )

        userAdapter = UserAdapter(userList)
        recyclerView.adapter = userAdapter

        userAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("user", it)

            startActivity(intent)

        }
    }
}


