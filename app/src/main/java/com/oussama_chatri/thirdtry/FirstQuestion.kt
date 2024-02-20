package com.oussama_chatri.thirdtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentFirstQuestionBinding

class FirstQuestion : Fragment() {
   lateinit var first:FragmentFirstQuestionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        first= FragmentFirstQuestionBinding.inflate(inflater,container,false)

        first.s.setOnClickListener{v:View ->
            scoore+=10
           mainActivity.score.text="Score: $scoore $"
            v.findNavController().navigate(R.id.action_firstQuestion2_to_secondQuestion2)
        }
        first.t.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_firstQuestion2_to_score2)
        }
        first.ff.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_firstQuestion2_to_score2)
        }
        return first.root
    }

}