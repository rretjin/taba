package com.ddk.wineapp.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ddk.wineapp.MainActivity
import com.ddk.wineapp.adapter.RecipeBoardListAdapter
import com.ddk.wineapp.databinding.FragmentBoardBinding

class BoardFragment : Fragment() {

    private lateinit var binding: FragmentBoardBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBoardBinding.inflate(inflater)

        binding.boardRecyclerView.adapter = RecipeBoardListAdapter(this)

        binding.settingButton.setOnClickListener {
            val action = BoardFragmentDirections.actionFragmentBoardToSettingFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        val act = activity as MainActivity
        act.supportActionBar?.show()
    }
}
