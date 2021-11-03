package com.example.list_of_months

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.list_of_months.adapter.itemAdapter
import com.example.list_of_months.data.datasurce
import com.example.list_of_months.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mydataset = datasurce().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
        recyclerView.adapter = itemAdapter(this,mydataset)
        recyclerView.setHasFixedSize(true)
    }
}