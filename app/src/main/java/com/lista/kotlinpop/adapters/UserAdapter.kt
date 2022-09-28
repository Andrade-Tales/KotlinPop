package com.lista.kotlinpop.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lista.kotlinpop.R
import com.lista.kotlinpop.model.User

class UserAdapter(val userList: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    var onItemClick: ((User) -> Unit)? = null

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemPerfilImagem: ImageView = itemView.findViewById(R.id.perfil_imagem)
        val itemTitulo: TextView = itemView.findViewById(R.id.item_titulo)
        val itemDescricao: TextView = itemView.findViewById(R.id.item_descricao)
        val itemUsername: TextView = itemView.findViewById(R.id.item_username)
        val NomeSobrenome: TextView = itemView.findViewById(R.id.nome_sobrenome)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return UserViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserAdapter.UserViewHolder, position: Int) {
        val user = userList[position]
        holder.itemPerfilImagem.setImageResource(user.perfilImagem)
        holder.itemTitulo.text = user.titulo
        holder.itemDescricao.text = user.descricao
        holder.itemUsername.text = user.nome
        holder.NomeSobrenome.text = user.sobrenome

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(user)
        }

    }
}