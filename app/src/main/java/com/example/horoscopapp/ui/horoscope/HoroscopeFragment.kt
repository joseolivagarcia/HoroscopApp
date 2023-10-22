package com.example.horoscopapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscopapp.databinding.FragmentHoroscopeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

    //Aqui el binding es un poco distinto al de las activities
    private var _binding: FragmentHoroscopeBinding? = null
    //ahora defino un valor y con el get hago que al llamar a binding obtenga el _binding
    private val binding get() = _binding!!

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