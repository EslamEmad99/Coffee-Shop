package eslam.emad.coffeshop

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(var farm: Farm, var sugar: Int) {

    private var TAG = "log_test"
    @Inject lateinit var river: River

    fun getCoffeeCup(): String{
        return "${river.getWater()} + ${farm.getBeans()} + sugar : $sugar"
    }

    @Inject
    fun connectElectricity(){
        Log.d(TAG, "connectElectricity: connecting...")
    }
}