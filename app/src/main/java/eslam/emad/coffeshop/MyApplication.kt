package eslam.emad.coffeshop

import android.app.Application

class MyApplication : Application() {
    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
}