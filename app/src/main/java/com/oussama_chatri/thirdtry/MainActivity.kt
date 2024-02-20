package com.oussama_chatri.thirdtry

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.window.BackEvent
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.oussama_chatri.thirdtry.databinding.ActivityMainBinding

 public var scoore:Int=0
public lateinit var mainActivity: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivity.root)

        mainActivity.score.text="Score : $scoore"


    }

}
