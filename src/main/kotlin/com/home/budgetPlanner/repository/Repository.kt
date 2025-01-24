package com.home.budgetPlanner.repository

import com.home.budgetPlanner.model.SalaryPeriod
import org.springframework.stereotype.Repository
import java.util.*


/**
 * сохраняем в ямлы?
 *
 *
 * */
@Repository
interface Repository {
    fun saveSalaryPeriod(period: SalaryPeriod)
    fun getAllPeriods()
    fun getPeriodsAfterDate(date: Date)
}