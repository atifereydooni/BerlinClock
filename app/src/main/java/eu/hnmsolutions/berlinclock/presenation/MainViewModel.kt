package eu.hnmsolutions.berlinclock.presenation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import eu.hnmsolutions.berlinclock.domain.BerlinClockUseCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(
    private val berlinClockUseCase: BerlinClockUseCase
) : ViewModel() {

    private val _berlinClockLiveData = MutableLiveData<String>()
    val berlinClockLiveData: LiveData<String> get() = _berlinClockLiveData

    init {
        viewModelScope.launch {
            while (true) {
                berlinClock(LocalDateTime.now())
                delay(1000)
            }
        }
    }

    fun berlinClock(time: LocalDateTime) {
        _berlinClockLiveData.value =
            berlinClockUseCase.berlinClock(time.hour, time.minute, time.second)
                .replace(" ", "\n")
    }

}