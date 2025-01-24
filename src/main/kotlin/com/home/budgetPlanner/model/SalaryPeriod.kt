package com.home.budgetPlanner.model

import java.util.*

class SalaryPeriod(
    date: Date,
    comming: Comming
) {
    private val expencese = emptyArray<Expence>()

    fun addExpence(expence: Expence) {
        expencese.plus(expence)
    }
}