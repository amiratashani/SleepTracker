package com.example.sleeptracker.sleepquality

import androidx.lifecycle.ViewModel
import com.example.sleeptracker.database.SleepDatabaseDao

class SleepQualityViewModel(
    private val sleepNightKey: Long = 0L,
    val database: SleepDatabaseDao
) : ViewModel() {
}