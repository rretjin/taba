package com.ddk.wineapp.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ddk.wineapp.MainActivity
import com.ddk.wineapp.R
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

        // 북마크 리스트 설정
        binding.boardRecyclerView.adapter = RecipeBoardListAdapter(this)

        // 설정 버튼 설정
        binding.settingButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_board_to_settingFragment)
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
