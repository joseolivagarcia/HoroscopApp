package com.example.horoscopapp.ui.horoscope

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.horoscopapp.databinding.FragmentHoroscopeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

    private val horoscopeViewModel by viewModels<HoroscopeViewModel>()

    //Aqui el binding es un poco distinto al de las activities
    private var _binding: FragmentHoroscopeBinding? = null
    //ahora defino un valor y con el get hago que al llamar a binding obtenga el _binding
    private val binding get() = _binding!!

    //este metodo se ejecuta una vez creada la vista con el onCreateView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    private fun initUi() {
        initUIState()
    }

    private fun initUIState() {
        //aqui nos enganchamos al viewmodel a traves de corutinas
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeViewModel.horoscope.collect{
                    //el collet equivale a suscribirse y siempre que se modifique el viewmodel se llamara a esta linea
                    Log.i("Jose",it.toString())
                }
            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Asigno un valor a _binding
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        //y devuelvo el binding que ya hace referencia al _binding
        return binding.root
    }

}