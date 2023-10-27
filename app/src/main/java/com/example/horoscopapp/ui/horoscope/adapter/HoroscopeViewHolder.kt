package com.example.horoscopapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopapp.databinding.ItemHoroscopeBinding
import com.example.horoscopapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener{
            startRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)}) //llamo a la funcion que ejecuta la animacion de esta imagen que le paso
            //onItemSelected(horoscopeInfo)
        }

    }

    private fun startRotationAnimation(view: View, newLambda:() -> Unit){
        //creo la animacion de la vista con unas propiedades determinadas
        view.animate().apply {
            duration = 300
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction(newLambda) //lo que pasemos aqui se ejecuta cuando termine la animacion. En este caso recibe otra lambda
            start()
        }
    }
}