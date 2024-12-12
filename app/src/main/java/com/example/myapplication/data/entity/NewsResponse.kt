package com.example.myapplication.data.entity

data class NewsResponse(
    val status:String,
    val totalResults:String,
    val articles:List<Article>

)
data class Article(
    val author:String,
    val title:String,
    val description:String,
    val url:String,
    val urlToImage:String,
    val publishedAt:String,
    val content:String,
    val source:Source

)
data class Source(
    val id:String,
    val name:String

)
