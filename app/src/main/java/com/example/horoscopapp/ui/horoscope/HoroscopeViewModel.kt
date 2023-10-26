package com.example.horoscopapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.example.horoscopapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {

    /*
    * creo una primera var privada para que no se pueda acceder desde fuera del viewmodel.
    * Esta lista es mutable porque puede variar. Por eso creo una segunda val publica que referencia
    * a la primera y esta es a la que voy a poder acceder desde el fragment. Asi el usuario podra leer los
    * datos del _horoscope a traves de horoscope pero no podra modificarlos.*/
    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<HoroscopeInfo>> = _horoscope

    //ahora creo el metodo que se ejecuta nada mas llamar al viewmodel
    init {
        _horoscope.value = listOf(
            HoroscopeInfo.Aquarius,HoroscopeInfo.Aries,HoroscopeInfo.Cancer,HoroscopeInfo.Capricornio,HoroscopeInfo.Escorpio,
            HoroscopeInfo.Geminis,HoroscopeInfo.Leo,HoroscopeInfo.Libra,HoroscopeInfo.Piscis,HoroscopeInfo.Sagitario,
            HoroscopeInfo.Tauro,HoroscopeInfo.Virgo
        )
    }

}