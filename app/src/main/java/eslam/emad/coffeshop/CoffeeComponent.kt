package eslam.emad.coffeshop

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface CoffeeComponent {

    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk milk: Int): Builder

        fun build(): CoffeeComponent
    }
}