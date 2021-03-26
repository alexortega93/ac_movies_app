package com.example.acmoviesapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

inline fun <reified T : Activity> Context.intentFor(body: Intent.() -> Unit) : Intent =
    Intent(this, T::class.java).apply(body)

inline fun <reified T : Activity> Context.startActivity(body: Intent.() -> Unit) {
    startActivity(intentFor<T> (body))
}



fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).into(this)
}