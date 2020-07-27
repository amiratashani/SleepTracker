package com.example.sleeptracker.sleepquality

import android.text.Editable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.sleeptracker.database.SleepDatabaseDao

@Suppress("UNCHECKED_CAST")
class SleepQualityViewModelFactory(
    private val sleepNightKey: Long,
    private val dataSource: SleepDatabaseDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SleepQualityViewModel::class.java))
            return SleepQualityViewModel(sleepNightKey, dataSource) as T
        throw IllegalAccessException("Unknown ViewModel class")
    }

}