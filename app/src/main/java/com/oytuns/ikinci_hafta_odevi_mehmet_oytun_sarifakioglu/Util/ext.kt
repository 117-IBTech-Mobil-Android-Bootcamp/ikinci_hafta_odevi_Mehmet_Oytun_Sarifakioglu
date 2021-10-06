package com.oytuns.ikinci_hafta_odevi_mehmet_oytun_sarifakioglu.Util

import android.content.Context
import android.content.Intent
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

inline fun<reified T : AppCompatActivity> Context.startActivity(block : Intent.() -> Unit = {}){
    val intent  = Intent(this , T::class.java)
    startActivity(
        intent.also {
            block.invoke(it)
        }
    )
}

fun AppCompatActivity.replaceFragmentSafely(fragmentName: Fragment, @IdRes containerViewId: Int){
    val fragmentManager=supportFragmentManager
    val fragmentTransaction=fragmentManager.beginTransaction()
    val questionAnswerFragment= fragmentName
    fragmentTransaction.replace(containerViewId,questionAnswerFragment).commit()
}