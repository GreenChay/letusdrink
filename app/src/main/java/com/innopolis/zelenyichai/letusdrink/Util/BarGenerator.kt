package com.innopolis.zelenyichai.letusdrink.Util

import com.innopolis.zelenyichai.letusdrink.Models.BarModel

object BarGenerator {
    fun generateBars(count: Int): List<BarModel>{
        val barList = mutableListOf<BarModel>()
        for (i in 1..count){
            barList.add(generateBar())
        }
        return barList
    }

    private fun generateBar(): BarModel {
        return BarModel("QWERTY", "ASDFGH", "ZXCVBN")
    }
}