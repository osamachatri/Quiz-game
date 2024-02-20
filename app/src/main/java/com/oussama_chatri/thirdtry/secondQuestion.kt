package com.oussama_chatri.thirdtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentSecondQuestionBinding

class secondQuestion : Fragment() {
   lateinit var second:FragmentSecondQuestionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        second= FragmentSecondQuestionBinding.inflate(inflater,container,false)

        second.t.setOnClickListener{v:View ->
            scoore+=20
            mainActivity.score.text="Score: $scoore $"
            v.findNavController().navigate(R.id.action_secondQuestion2_to_thirdQuestion2)
        }
        second.s.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_secondQuestion2_to_score2)
        }
        second.f.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_secondQuestion2_to_score2)
        }

        return second.root
    }

}