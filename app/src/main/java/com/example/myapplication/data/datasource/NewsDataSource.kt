package com.example.myapplication.data.datasource

import com.example.myapplication.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsDataSource {
    @GET("v2/top-headlines")
    fun getNewsHeadlines(
        country: String,

    ): Response<NewsResponse>
}