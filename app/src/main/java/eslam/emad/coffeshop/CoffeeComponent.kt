package eslam.emad.coffeshop

import dagger.Component

@Component
interface CoffeeComponent {

    fun getCoffee(): Coffee

}