package com.example.horoscopapp.ui.palminstry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.horoscopapp.R
import com.example.horoscopapp.databinding.FragmentHoroscopeBinding
import com.example.horoscopapp.databinding.FragmentLuckBinding
import com.example.horoscopapp.databinding.FragmentPalminstryBinding
import com.example.horoscopapp.ui.horoscope.HoroscopeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalminstryFragment : Fragment() {

    private val palminstryViewModel by viewModels<PalminstryViewModel>()

    //Aqui el binding es un poco distinto al de las activities
    private var _binding: FragmentPalminstryBinding? = null
    //ahora defino un valor y con el get hago que al llamar a binding obtenga el _binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Asigno un valor a _binding
        _binding = FragmentPalminstryBinding.inflate(layoutInflater, container, false)
        //y devuelvo el binding que ya hace referencia al _binding
        return binding.root
    }

}