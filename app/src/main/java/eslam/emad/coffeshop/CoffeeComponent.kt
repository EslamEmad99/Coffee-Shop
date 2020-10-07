package eslam.emad.coffeshop

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface CoffeeComponent {

    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{

        fun create(@BindsInstance @Sugar sugar: Int, @BindsInstance @Milk milk: Int): CoffeeComponent
    }
}