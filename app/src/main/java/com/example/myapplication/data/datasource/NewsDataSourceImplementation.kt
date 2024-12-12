package com.example.myapplication.data.datasource

import com.example.myapplication.data.api.ApiServices
import com.example.myapplication.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImplementation @Inject constructor(private val apiService: ApiServices):NewsDataSource {
    override fun getNewsHeadlines(country: String): Response<NewsResponse> {
return apiService.getNewsHeadlines(country)
    }
//we have an interface api service which provide us some response
    //we create a data source implementation with respective data source of that function

}//inside the data source implementation we are injecting api service dependenci and calling the respective function