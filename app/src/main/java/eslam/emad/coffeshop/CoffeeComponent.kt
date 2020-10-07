package eslam.emad.coffeshop

import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class])
interface CoffeeComponent {

    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk milk: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): CoffeeComponent
    }
}