package com.oussama_chatri.thirdtry

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var mainBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       mainBinding= FragmentMainBinding.inflate(inflater,container,false)

        mainBinding.Play.setOnClickListener{v:View ->
            v.findNavController().navigate(R.id.action_mainFragment_to_firstQuestion2)
            mainActivity.score.visibility= View.VISIBLE
        }

        return mainBinding.root
    }

}