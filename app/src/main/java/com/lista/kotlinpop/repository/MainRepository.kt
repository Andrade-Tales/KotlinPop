package com.lista.kotlinpop.repository

import com.lista.kotlinpop.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllUsers() = retrofitService.getAllUsers()

}