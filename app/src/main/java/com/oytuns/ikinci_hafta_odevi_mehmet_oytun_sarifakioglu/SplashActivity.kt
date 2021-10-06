package com.oytuns.ikinci_hafta_odevi_mehmet_oytun_sarifakioglu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oytuns.ikinci_hafta_odevi_mehmet_oytun_sarifakioglu.Util.startActivity
import java.util.*

class SplashActivity : AppCompatActivity() {

    private val DELAY: Long = 3*1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(object: TimerTask(){
            override fun run(){
                startActivity<MainActivity>()
                finish()
            }
        },DELAY)
    }
}