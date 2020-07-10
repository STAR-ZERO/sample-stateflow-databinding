package com.star_zero.stateflow.databinding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import kotlinx.coroutines.flow.StateFlow

interface AppViewBinding {
    @BindingAdapter("textStateFlow")
    fun setText(view: TextView, stateFlow: StateFlow<String>)
}
