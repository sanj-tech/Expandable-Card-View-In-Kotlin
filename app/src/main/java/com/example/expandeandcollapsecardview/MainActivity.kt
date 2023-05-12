package com.example.expandeandcollapsecardview

import android.animation.LayoutTransition
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.expandeandcollapsecardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        callExpandedView()

    }

    private fun callExpandedView() {
        binding.ll.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.ll.setOnClickListener({
            var view = if (binding.tvDetail.visibility == View.GONE) View.VISIBLE else View.GONE
            binding.tvDetail.visibility = view

        })
    }
}