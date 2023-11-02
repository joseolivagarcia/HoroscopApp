package com.example.horoscopapp.domain

import com.example.horoscopapp.data.network.response.PredictionResponse
import com.example.horoscopapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String):PredictionModel?
}