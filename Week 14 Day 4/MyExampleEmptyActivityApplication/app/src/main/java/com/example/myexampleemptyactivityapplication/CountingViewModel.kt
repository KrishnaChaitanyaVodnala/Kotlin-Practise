package com.example.myexampleemptyactivityapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

class CountingViewModel : ViewModel() {

    private val _numbers = MutableStateFlow<List<Int>>(emptyList())
    val numbers: StateFlow<List<Int>> = _numbers

    init {
        viewModelScope.launch {
            countingFlow().collect { value ->
                _numbers.value += value
            }
        }
        viewModelScope.launch {
            countingFlow().collect { value ->
                _numbers.value += value
            }
        }
    }

    private fun countingFlow(): Flow<Int> {
        return flow {
            val startValue = 1
            var currentValue = startValue
            while (currentValue < 6) {
                delay(1000L.milliseconds)
                emit(currentValue)
                currentValue++
            }
        }
    }
}