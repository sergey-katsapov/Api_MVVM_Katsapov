package com.example.filmsmvvm.api

import com.example.filmsmvvm.api.data.SearchImageListDto
import retrofit2.http.GET
import retrofit2.http.Query

//TODO refactor
interface MoviesApi {

    @GET("/api")
    suspend fun search(@Query("key") apiKey: String, @Query("q") query: String): SearchImageListDto
}