package eu.hnmsolutions.berlinclock.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.hnmsolutions.berlinclock.data.BerlinClockCalculator
import eu.hnmsolutions.berlinclock.domain.BerlinClockUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BerlinClockModule {

    @Singleton
    @Provides
    fun providesBerlinClockUseCase(berlinClockCalculator: BerlinClockCalculator): BerlinClockUseCase {
        return BerlinClockUseCase(berlinClockCalculator)
    }

}
