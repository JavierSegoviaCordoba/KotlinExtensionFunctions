import com.google.android.material.snackbar.Snackbar

/**
 * Call a function when an Snackbar is dismissed
 *
 * @param onDismissed Function to be called
 */
inline fun Snackbar.onDismissed(crossinline onDismissed: () -> Unit) {
    addCallback(object : Snackbar.Callback() {
        override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
            super.onDismissed(transientBottomBar, event)
            onDismissed()
        }
    })
}