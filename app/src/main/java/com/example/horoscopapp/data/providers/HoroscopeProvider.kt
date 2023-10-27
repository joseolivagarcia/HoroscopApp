package com.example.horoscopapp.data.providers

import com.example.horoscopapp.domain.model.HoroscopeInfo
import com.example.horoscopapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    fun getHoroscopes(): List<HoroscopeInfo>{
        return listOf(
            Aquarius,Aries,Cancer,Capricornio,Escorpio,
            Geminis,Leo,Libra,Piscis,Sagitario,
           Tauro,Virgo
        )
    }
}