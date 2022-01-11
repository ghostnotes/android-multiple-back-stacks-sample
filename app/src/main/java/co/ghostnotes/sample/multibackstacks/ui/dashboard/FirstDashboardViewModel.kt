package co.ghostnotes.sample.multibackstacks.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstDashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "First DASHBOARD"
    }
    val text: LiveData<String> = _text
}