package eslam.emad.coffeshop

import android.util.Log
import javax.inject.Inject

class Farm @Inject constructor() {
    private var TAG = "log_test"

    init {
        Log.d(TAG, "Farm:")
    }

    fun getBeans(): String {
        return "Beans"
    }
}