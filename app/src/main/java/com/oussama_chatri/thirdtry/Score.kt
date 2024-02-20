package com.oussama_chatri.thirdtry

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentScoreBinding

class Score : Fragment() {
   lateinit var score: FragmentScoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        score= FragmentScoreBinding.inflate(inflater,container,false)
        mainActivity.score.visibility=View.INVISIBLE
        if (scoore==0){
            score.scoore.text="What?? You should know this basic thing! Your score is 0!?"
        }else if (scoore==10){
            score.scoore.text="What is this! You win $scoore $"
        }else if (scoore==30){
            score.scoore.text="You should try again! You win $scoore $"
        }else if (scoore==60){
            score.scoore.text="Well, try again! You win $scoore $"
        }else if (scoore==100){
            score.animationView.visibility=View.VISIBLE
            score.scoore.text="WOW, you was nearly from won! You win $scoore $"
        }else{
            score.animationView.visibility=View.VISIBLE
            score.scoore.text="WOW, You are win! You win $scoore $"
        }
        score.tryagain.setOnClickListener { v:View ->
            v.findNavController().navigate(R.id.main_navigation)
            scoore=0
            mainActivity.score.text="Score: $scoore $"
        }
       return score.root
        }
}