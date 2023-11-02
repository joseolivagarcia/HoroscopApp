package com.example.horoscopapp.data.network

import com.example.horoscopapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {
    //Aqui definimos las peticiones a internet
    //en este caso es una peticion get y va a recibir un parametro (el signo del zodiaco) por eso va entre ponemos el path en la funcion
    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign: String): PredictionResponse //la funcion devuelve un prediction response con los datos que yo necesite
}