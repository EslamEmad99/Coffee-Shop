package eslam.emad.coffeshop

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Coffee @Inject constructor(var farm: Farm, @Sugar var sugar: Int, @Milk var milk: Int) {

    private var TAG = "log_test"
    @Inject lateinit var river: River

    fun getCoffeeCup(): String{
        return "${river.getWater()} + ${farm.getBeans()} + sugar: $sugar + milk: $milk"
    }

    @Inject
    fun connectElectricity(){
        Log.d(TAG, "connectElectricity: connecting...")
    }
}