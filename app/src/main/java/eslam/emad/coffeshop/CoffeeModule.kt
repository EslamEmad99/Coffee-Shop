package eslam.emad.coffeshop

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoffeeModule {

    @Singleton
    @Provides
    fun provideRiver(): River{
        return River()
    }
}