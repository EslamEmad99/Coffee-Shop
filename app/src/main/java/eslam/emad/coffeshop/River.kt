package eslam.emad.coffeshop

import android.util.Log
import javax.inject.Inject

class River @Inject constructor() {

    private var TAG = "log_test"

    init {
        Log.d(TAG, "River:")
    }

    fun getWater(): String{
        return "Water"
    }
}