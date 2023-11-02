package com.example.horoscopapp.domain.usecase

import com.example.horoscopapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}