package com.example.horoscopapp.domain.model

import com.example.horoscopapp.R

sealed class HoroscopeInfo(val img: Int, val name: Int){ //estoy pasando tipos Int porque no paso textos sino referencias
    data object Aquarius: HoroscopeInfo(R.drawable.aquario, R.string.aquarius)
    data object Aries: HoroscopeInfo(R.drawable.aries, R.string.aries)
    data object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    data object Capricornio: HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    data object Escorpio: HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    data object Geminis: HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    data object Leo: HoroscopeInfo(R.drawable.leo, R.string.leo)
    data object Libra: HoroscopeInfo(R.drawable.libra, R.string.libra)
    data object Piscis: HoroscopeInfo(R.drawable.piscis, R.string.pisces)
    data object Sagitario: HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    data object Tauro: HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    data object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.virgo)
}