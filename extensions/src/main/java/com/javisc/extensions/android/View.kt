package com.javisc.extensions.android

import android.view.View
import com.google.android.material.snackbar.Snackbar
import onDismissed

/**
 * Show an Snackbar with short length and implement onDismissed callback
 *
 * @param message Text to show
 * @param onDismissed The function called when Snackbar dismisses.
 */
inline fun View.snackbarShortOnDismissed(message: String, crossinline onDismissed: () -> Unit) {
    val snackbar = Snackbar.make(this, message, Snackbar.LENGTH_SHORT)
    snackbar.onDismissed { onDismissed() }
    snackbar.show()
}