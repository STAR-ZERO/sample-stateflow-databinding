package com.star_zero.stateflow.databinding

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _text = MutableStateFlow("Hello World!")
    val text: StateFlow<String> = _text

    fun onClickButton() {
        _text.value = "Hello StateFlow: ${System.currentTimeMillis()}"
    }
}
