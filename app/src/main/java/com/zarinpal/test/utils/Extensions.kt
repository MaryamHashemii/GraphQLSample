package com.zarinpal.test.utils

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun Context.toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

