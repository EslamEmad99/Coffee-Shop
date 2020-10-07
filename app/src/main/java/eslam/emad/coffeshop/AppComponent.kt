package eslam.emad.coffeshop

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RiverModule::class])
interface AppComponent {

    fun coffeeComponentFactory(): CoffeeComponent.Factory
}