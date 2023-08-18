package com.ddk.wineapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.ddk.wineapp.adapter.ChatReplyAdapter
import com.ddk.wineapp.adapter.RecipeViewPagerAdapter
import com.ddk.wineapp.databinding.ActivityBoardReadBinding

class BoardReadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoardReadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_read)

        // 뷰 바인딩 설정
        binding = ActivityBoardReadBinding.inflate(layoutInflater)

        // 상단 툴바 설정
        binding.boardToolbar.setNavigationIcon(R.drawable.ic_arrowleft_dark)
        binding.boardToolbar.setNavigationOnClickListener { finish() }

        // 레시피 사진 처리 - 뷰페이저
        val viewPager2 = binding.viewpagerRecipe
        viewPager2.adapter = RecipeViewPagerAdapter()
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // 댓글 리스트 설정
        binding.chatListView.adapter = ChatReplyAdapter(this)

        // 스크랩 버튼 설정
        binding.scrapButton.setOnClickListener {
            binding.scrapButton.isSelected = !binding.scrapButton.isSelected
        }

        setContentView(binding.root)
    }
}