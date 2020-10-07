package eslam.emad.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //@Inject lateinit var coffee: Coffee
    //@Inject lateinit var coffee2: Coffee
    private var TAG = "log_test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as MyApplication).component

        val coffee = component.getCoffee()
        val coffee2 = component.getCoffee()

        Log.d(TAG, "onCreate: $coffee ${coffee.farm} + ${coffee.river} \n $coffee2 ${coffee2.farm} + ${coffee2.river}")
    }
}