package com.oussama_chatri.thirdtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentFinalQuestionBinding

class FinalQuestion : Fragment() {
lateinit var final:FragmentFinalQuestionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        final= FragmentFinalQuestionBinding.inflate(inflater,container,false)

        final.t.setOnClickListener{v:View ->
            scoore+=50
            mainActivity.score.text="Score: $scoore $"
            v.findNavController().navigate(R.id.action_finalQuestion2_to_score2)
        }
        final.s.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_finalQuestion2_to_score2)
        }
        final.f.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_finalQuestion2_to_score2)
        }

         return final.root
    }

}