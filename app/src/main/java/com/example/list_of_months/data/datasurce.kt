package com.example.list_of_months.data

import com.example.list_of_months.R
import com.example.list_of_months.model.model

class datasurce {

    fun loadAffirmation():List<model>{
        return listOf<model>(
            model(R.string.month1),
            model(R.string.month2),
            model(R.string.month3),
            model(R.string.month4),
            model(R.string.month5),
            model(R.string.month6),
            model(R.string.month7),
            model(R.string.month8),
            model(R.string.month9),
            model(R.string.month10),
            model(R.string.month11),
            model(R.string.month12),
        )
    }
}