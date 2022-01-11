package co.ghostnotes.sample.multibackstacks.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondDashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Second DASHBOARD"
    }
    val text: LiveData<String> = _text
}