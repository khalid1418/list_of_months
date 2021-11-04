package com.example.list_of_months.data

import com.example.list_of_months.R
import com.example.list_of_months.model.model

class datasurce {

    fun loadAffirmation():List<model>{
        return listOf<model>(
            model(R.string.month1, R.drawable.januaryrr),
            model(R.string.month2 , R.drawable.images__1_),
            model(R.string.month3 , R.drawable.images),
            model(R.string.month4 , R.drawable.__1_),
            model(R.string.month5, R.drawable.__2_),
            model(R.string.month6, R.drawable.__3_),
            model(R.string.month7, R.drawable.__4_),
            model(R.string.month8, R.drawable.maxresdefault),
            model(R.string.month9, R.drawable.__5_),
            model(R.string.month10, R.drawable.__6_),
            model(R.string.month11, R.drawable.__7_),
            model(R.string.month12, R.drawable.__8_),
        )
    }
}