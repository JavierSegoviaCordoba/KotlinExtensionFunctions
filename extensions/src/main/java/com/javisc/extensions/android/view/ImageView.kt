package com.javisc.extensions.android.view

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.squareup.picasso.Picasso

/**
 * @see <a href="https://github.com/bumptech/glide">Glide</a>
 */

/**
 * Load an image
 *
 * @param url image link
 */
fun ImageView.glide(url: String) = Glide.with(this).load(url).into(this)

/**
 * Load an image with cross fade animation
 *
 * @param url image link
 */
fun ImageView.glideWithCrossFade(url: String) =
    Glide.with(this).load(url).transition(DrawableTransitionOptions.withCrossFade()).into(this)

/**
 * Load an image with cross fade animation and transform it to a circle shape
 *
 * @param url image link
 */
fun ImageView.glideWithCrossFadeCircle(url: String) =
    Glide.with(this).load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions.circleCropTransform())
        .into(this)


/**
 * @see <a href="https://github.com/square/picasso">Picasso</a>
 */

/**
 * Load an image
 *
 * @param url image link
 */
fun ImageView.picasso(url: String) = Picasso.get().load(url).into(this)
