package com.example.lottiesearchanimation

import android.os.Bundle
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {

    var customSearchBar: LottieAnimationView? = null //Declaration of componenet
    var searchBar : SearchView? = null
    var isAnimated :Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        customSearchBar = findViewById(R.id.searchanimationView)//linking component from the cml
        searchBar = findViewById(R.id.searchview)
        searchBar?.bringToFront()
        searchBar?.setOnClickListener() {


        }
        /* customSearchBar?.setOnClickListener(){
                        if(!isAnimated){
                            customSearchBar?.speed = 1.5f
                            isAnimated=true
                            customSearchBar?.playAnimation()
                            searchBar?.bringToFront()

                        }else{
                            customSearchBar?.setSpeed(-1.8f)
                            isAnimated=false
                            customSearchBar?.playAnimation()
                        }
            }*/
    }




}



