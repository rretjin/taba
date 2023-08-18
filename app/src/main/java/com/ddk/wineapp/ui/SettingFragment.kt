package com.ddk.wineapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ddk.wineapp.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {
    private lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanState: Bundle?
    ): View {
        binding = FragmentSettingBinding.inflate(inflater)

        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }
}