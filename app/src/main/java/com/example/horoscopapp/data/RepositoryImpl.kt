package com.example.horoscopapp.data

import android.util.Log
import com.example.horoscopapp.data.network.HoroscopeApiService
import com.example.horoscopapp.data.network.response.PredictionResponse
import com.example.horoscopapp.domain.Repository
import com.example.horoscopapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain()}
            .onFailure { Log.i("jose","ha ocurrido un error ${it.message}") }
        return null
    }
}