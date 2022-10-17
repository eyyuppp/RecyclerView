package com.eyyuperdogan.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eyyuperdogan.recyclerview.databinding.ActivityDetailsBinding
import com.eyyuperdogan.recyclerview.databinding.ActivityMainBinding

private lateinit var binding: ActivityDetailsBinding

class detailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent=getIntent()
        val selectedLendmark=intent.getSerializableExtra("landmark") as landmark

        binding.textViewName.text=selectedLendmark.name
        binding.textViewCauntry.text=selectedLendmark.cauntry
        binding.imageView.setImageResource(selectedLendmark.image)


    }
}