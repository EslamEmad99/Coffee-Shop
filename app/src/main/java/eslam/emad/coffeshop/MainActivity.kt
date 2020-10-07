package eslam.emad.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var coffee: Coffee
    private var TAG = "log_test"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCoffeeComponent.create()
        //var coffee = component.getCoffee()
        component.inject(this)

        Log.d(TAG, "onCreate: ${coffee.getCoffeeCup()}")
    }
}