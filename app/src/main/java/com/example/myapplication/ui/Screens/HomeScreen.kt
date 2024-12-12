package com.example.myapplication.ui.Screens


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myapplication.ui.ViewModels.NewsViewModel

import java.lang.reflect.Modifier


@Composable
fun HomeScreen(
    //a variable named newsiewmodel of type viewmodel and initialized it with FlightView
    newsViewModel: NewsViewModel= hiltViewModel()
    //hilt has injected an instance of news view model into this composable

) {
  Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {

  }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
