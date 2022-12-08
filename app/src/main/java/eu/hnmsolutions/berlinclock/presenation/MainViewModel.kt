package eu.hnmsolutions.berlinclock.presenation

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import eu.hnmsolutions.berlinclock.domain.BerlinClockUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(
    private val berlinClockUseCase: BerlinClockUseCase
) : ViewModel() {

    fun berlinClock(){
        Log.d("MainViewModelTAG", berlinClockUseCase.berlinClock(13, 17, 1))
    }

}