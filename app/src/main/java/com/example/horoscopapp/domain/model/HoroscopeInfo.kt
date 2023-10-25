package com.example.horoscopapp.domain.model

import com.example.horoscopapp.R

sealed class HoroscopeInfo(val img: Int, val name: Int){ //estoy pasando tipos Int porque no paso textos sino referencias
    object Aquarius: HoroscopeInfo(R.drawable.aquario, R.string.aquarius)
    object Aries: HoroscopeInfo(R.drawable.aries, R.string.aries)
    object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    object Capricornio: HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    object Escorpio: HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    object Geminis: HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    object Leo: HoroscopeInfo(R.drawable.leo, R.string.leo)
    object Libra: HoroscopeInfo(R.drawable.libra, R.string.libra)
    object Piscis: HoroscopeInfo(R.drawable.piscis, R.string.pisces)
    object Sagitario: HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    object Tauro: HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.virgo)
}