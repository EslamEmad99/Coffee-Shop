package eslam.emad.coffeshop

import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {

    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)
}