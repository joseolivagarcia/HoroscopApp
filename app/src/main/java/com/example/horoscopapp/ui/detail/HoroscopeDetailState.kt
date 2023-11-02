package com.example.horoscopapp.ui.detail

sealed class HoroscopeDetailState {
    data object loading: HoroscopeDetailState() //como no necesita parametros es un object
    data class Error(val error: String): HoroscopeDetailState() //como necesita parametros sera una class
    data class success(val prediction: String, val sign: String): HoroscopeDetailState()
}