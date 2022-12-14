package com.lista.kotlinpop.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lista.kotlinpop.model.User
import com.lista.kotlinpop.repository.MainRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: MainRepository) : ViewModel() {

    val userList = MutableLiveData<List<User>>()
    val errorMessage = MutableLiveData<String>()

    fun getAllUsers() {

        val response = repository.getAllUsers()
        response.enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                userList.postValue(response.body())
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
}