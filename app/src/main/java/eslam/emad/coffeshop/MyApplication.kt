package eslam.emad.coffeshop

import android.app.Application

class MyApplication : Application() {
    lateinit var component: CoffeeComponent
    override fun onCreate() {
        super.onCreate()

        component = DaggerCoffeeComponent.builder()
            .sugar(2)
            .milk(1)
            .build()
    }
}