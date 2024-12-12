package com.example.myapplication.ui.ViewModels

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(): ViewModel() {
    init {
     Log.d(TAG, "init block of news view model ")
    }
companion object{
    const val TAG="NewsViewModel"
 }
}
