package com.zarinpal.test.data.datasource.sharedPref

import android.content.Context
import androidx.core.content.edit
import dagger.hilt.android.qualifiers.ApplicationContext
import com.zarinpal.test.data.datasource.sharedPref.UserSharedPref.UserSharedPrefKeys.TOKEN
import com.zarinpal.test.data.datasource.sharedPref.UserSharedPref.UserSharedPrefKeys.USER_PREF_NAME
import javax.inject.Inject

class UserSharedPref @Inject constructor(@ApplicationContext context: Context) {

    object UserSharedPrefKeys{
         const val USER_PREF_NAME = "user_pref"
         const val TOKEN = "token"
    }

    private val sharedPref = context.getSharedPreferences(USER_PREF_NAME, Context.MODE_PRIVATE)
    private val editor = sharedPref.edit()

    var token: String? = null
        set(value) {
            sharedPref.edit {
                putString(TOKEN, value)
            }
            field = value
        }
        get() = sharedPref.getString(TOKEN, null)


}