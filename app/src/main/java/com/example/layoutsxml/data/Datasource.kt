package com.example.layoutsxml.data

import com.example.layoutsxml.R

class Datasource {
    fun loadBrainStorms():List<BrainStorm>{
        return listOf<BrainStorm>(
            BrainStorm(R.string.brain_1),
            BrainStorm(R.string.brain_2),
            BrainStorm(R.string.brain_3),
            BrainStorm(R.string.brain_4),
            BrainStorm(R.string.brain_5),
            BrainStorm(R.string.brain_6),
            BrainStorm(R.string.brain_7),
            BrainStorm(R.string.brain_8),
            BrainStorm(R.string.brain_9),
            BrainStorm(R.string.brain_10)
        )

    }
}