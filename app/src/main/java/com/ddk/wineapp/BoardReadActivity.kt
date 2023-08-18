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

        binding = ActivityBoardReadBinding.inflate(layoutInflater)

        binding.boardToolbar.setNavigationIcon(R.drawable.ic_arrowleft_dark)
        binding.boardToolbar.setNavigationOnClickListener {
            finish()
        }

        // 레시피 사진 처리 - 뷰페이저
        val viewPager2 = binding.viewpagerRecipe
        viewPager2.adapter = RecipeViewPagerAdapter()
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        binding.chatListView.adapter = ChatReplyAdapter(this)

        binding.scrapButton.setOnClickListener {
            binding.scrapButton.isSelected = !binding.scrapButton.isSelected
        }

        setContentView(binding.root)
    }
}