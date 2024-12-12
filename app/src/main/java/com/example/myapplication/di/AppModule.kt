package com.example.myapplication.di

import com.example.myapplication.data.AppConstants
import com.example.myapplication.data.api.ApiServices
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


//we use modules to define 2rd party depencies
@Module
@InstallIn(SingletonComponent::class)//this enables those dependencies all over the app
class AppModule {
    @Provides
    @Singleton
    //we have created one dependency and one retrofot object and we can use this anywhere in our app and dagger will inject this object after doing all the work it is decoupled so we can use it anywhere
fun provideRetrofit(): Retrofit {

        val httpLoggingInterceptor=HttpLoggingInterceptor().apply {
            level=HttpLoggingInterceptor.Level.BASIC
        }
    val httpClient= OkHttpClient().newBuilder().addInterceptor(httpLoggingInterceptor)

    httpClient.apply {
        readTimeout(60, TimeUnit.SECONDS)
    }
val moshi= Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    return Retrofit.Builder()
        .baseUrl(AppConstants.APP_BASE_URL)
        .client(httpClient.build())
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()


}

    @Provides
    @Singleton
    fun provideApiServices(retrofit: Retrofit): ApiServices {
        //this will create an instance of api services
        return retrofit.create(ApiServices::class.java)


    }
}