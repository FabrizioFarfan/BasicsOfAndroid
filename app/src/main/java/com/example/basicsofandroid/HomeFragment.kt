package com.example.basicsofandroid

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.basicsofandroid.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_addContactFragment)
        }

        return binding.root
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}