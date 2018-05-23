package com.innopolis.zelenyichai.letusdrink

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