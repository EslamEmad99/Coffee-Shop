package eslam.emad.coffeshop

import android.util.Log
import javax.inject.Inject

class River {
    //This class is just for view, cannot edit it
    private var TAG = "log_test"

    init {
        Log.d(TAG, "River:")
    }

    fun getWater(): String{
        return "Water"
    }
}