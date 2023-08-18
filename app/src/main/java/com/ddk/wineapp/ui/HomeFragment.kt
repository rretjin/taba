package com.ddk.wineapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ddk.wineapp.MainActivity
import com.ddk.wineapp.R
import com.ddk.wineapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)

        // 검색 버튼 설정
        binding.searchButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_home_to_searchFragment)
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        // 이 화면 동작 중 항상 액션바 노출 : 화면 전환 시 하단바 아이콘이 바뀌지 않는 오류 수정
        val act = activity as MainActivity
        act.supportActionBar?.show()
    }
}