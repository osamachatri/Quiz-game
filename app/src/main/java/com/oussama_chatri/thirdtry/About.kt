package com.oussama_chatri.thirdtry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.oussama_chatri.thirdtry.databinding.FragmentAboutBinding

class About : Fragment() {
    lateinit var aboutBinding: FragmentAboutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       aboutBinding= FragmentAboutBinding.inflate(inflater,container,false)

        aboutBinding.back.setOnClickListener{view:View ->
            view.findNavController().popBackStack()
        }

        return aboutBinding.root
    }


}