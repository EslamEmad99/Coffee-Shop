package eslam.emad.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var coffee: Coffee
    @Inject lateinit var coffee2: Coffee
    private var TAG = "log_test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as MyApplication).component

        val coffeeComponent = DaggerCoffeeComponent.builder()
            .appComponent(component)
            .sugar(5)
            .milk(4)
            .build()

        coffeeComponent.inject(this)

        tv.text = "$coffee ${coffee.farm} + ${coffee.river} \n $coffee2 ${coffee2.farm} + ${coffee2.river}"
    }
}