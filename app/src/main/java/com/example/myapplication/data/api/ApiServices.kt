package com.example.myapplication.data.api

import com.example.myapplication.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiServices {
    @GET("v2/top-headlines")
    fun getNewsHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String ="48c3cb12387c4cd88245b001c7428134"
    ): Response<NewsResponse>
}

//48c3cb12387c4cd88245b001c7428134
//GET https://newsapi.org/v2/top-headlines?country=us&apiKey=48c3cb12387c4cd88245b001c7428134