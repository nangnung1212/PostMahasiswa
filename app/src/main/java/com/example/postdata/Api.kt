package com.example.postdata

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("users")
    fun getUsers(): Call<List<ResponseItem>>
}