package com.oussama_chatri.thirdtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentSecondQuestionBinding
import com.oussama_chatri.thirdtry.databinding.FragmentThirdQuestionBinding


class ThirdQuestion : Fragment() {
    lateinit var third:FragmentThirdQuestionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        third= FragmentThirdQuestionBinding.inflate(inflater,container,false)

        third.f.setOnClickListener{v:View ->
            scoore+=30
            mainActivity.score.text="Score: $scoore $"
            v.findNavController().navigate(R.id.action_thirdQuestion2_to_fouthquestion2)
        }
        third.t.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_thirdQuestion2_to_score2)
        }
        third.s.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_thirdQuestion2_to_score2)
        }

        return third.root
         }


}