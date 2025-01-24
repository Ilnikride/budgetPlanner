package com.home.budgetPlanner.service

import com.home.budgetPlanner.repository.Repository
import org.junit.jupiter.api.Test
import org.junit.platform.commons.annotation.Testable
import org.mockito.Mockito

class SalaryPeriodServiceTest() {
    private val repository = Mockito.mock(Repository::class.java)
    private val testable = SalaryPeriodService(repository,"")

    @Test
    fun schedulerTest(){
        testable.scheduleCreatePeriodFromConfig()
    }
}