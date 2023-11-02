package com.example.horoscopapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.example.horoscopapp.databinding.ActivityHoroscopeDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()

    private val args: HoroscopeDetailActivityArgs by navArgs() //en esta var recupero el signo que pase al pulsar sobre el
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        horoscopeDetailViewModel.getHoroscope(args.type.name)

    }

    private fun initUI() {
        initUIState()
    }

    private fun initUIState() {
        //nos enganchamos al state del viewmodel
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeDetailViewModel.state.collect{
                    //aqui recibimos un estado (el it) y esta linea se va a ejecutar siempre que modifiquemos ese estado
                    when(it){
                        HoroscopeDetailState.loading -> loadingState() //cuando el estado es loading mostramos el progress bar llamando a esta funcion
                        is HoroscopeDetailState.Error -> errorState()

                        is HoroscopeDetailState.success -> successState(it)

                    }
                }
            }
        }
    }

    private fun successState(state: HoroscopeDetailState.success) {
        binding.pb.isVisible = false
        binding.tvTitle.text = state.sign
        binding.tvBody.text = state.prediction
    }

    private fun errorState() {
        binding.pb.isVisible = false
    }

    private fun loadingState() {
        binding.pb.isVisible = true
    }
}