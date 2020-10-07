package eslam.emad.coffeshop

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {

    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk milk: Int): Builder

        fun build(): CoffeeComponent
    }
}