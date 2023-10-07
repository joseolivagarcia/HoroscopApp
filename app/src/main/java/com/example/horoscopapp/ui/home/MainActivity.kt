package com.example.horoscopapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.horoscopapp.R
import com.example.horoscopapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {
        initNavigation()
    }

    private fun initNavigation() {
        //creamos una var que inicialize el contenedor de los fragments (donde ira apareciendo el que llamemos)
        val navHost: NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController //con esto nuestro controlador controla el contenedor de fragments
        //a la barra de navegacion (menus) le pasamos nuestro navcontroler
        binding.bottomNavView.setupWithNavController(navController)
    }
}