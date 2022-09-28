package com.lista.kotlinpop.model

import android.os.Parcel
import android.os.Parcelable

data class User(
  //  val id: Int,
    val perfilImagem: Int,
    val titulo: String,
    val descricao: String,
    val nome: String,
    val sobrenome: String

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(perfilImagem)
        parcel.writeString(titulo)
        parcel.writeString(descricao)
        parcel.writeString(nome)
        parcel.writeString(sobrenome)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}