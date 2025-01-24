package com.home.budgetPlanner.service

import com.home.budgetPlanner.repository.Repository
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

/**
 * Сервис с основной логикой
 *
 * */
@Service
class SalaryPeriodService(
    private val repository: Repository,
    @Value("\${commingDates}")
    val commingDates: List<String>
) {


    fun createSalaryPeriod() {
       // repository.saveSalaryPeriod()
    }

    /**
     * Метод создания периодов на основе правила из ямла
     * в котором прописаны даты периодов и основные траты(категории)
     *
     * */
    fun scheduleCreatePeriodFromConfig() {
        println(commingDates)
    }

    fun getAllPeriods() {
        repository.getAllPeriods()
    }

    fun getPeriodsAfterDate(date: Date) {
        repository.getPeriodsAfterDate(date)
    }

}