package com.oussama_chatri.thirdtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentFouthquestionBinding

class fouthquestion : Fragment() {
lateinit var fourth:FragmentFouthquestionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        fourth= FragmentFouthquestionBinding.inflate(inflater,container,false)

        fourth.s.setOnClickListener{v:View ->
            scoore+=40
            mainActivity.score.text="Score: $scoore $"
            v.findNavController().navigate(R.id.action_fouthquestion2_to_finalQuestion2)
        }
        fourth.t.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_fouthquestion2_to_score2)
        }
        fourth.f.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_fouthquestion2_to_score2)
        }
        return fourth.root
          }

}