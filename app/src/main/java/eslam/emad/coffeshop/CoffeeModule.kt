package eslam.emad.coffeshop

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule (var sugar: Int) {


    @Provides
    fun provideRiver(): River{
        return River()
    }

    @Provides
    fun provideSugar(): Int{
        return sugar
    }
}