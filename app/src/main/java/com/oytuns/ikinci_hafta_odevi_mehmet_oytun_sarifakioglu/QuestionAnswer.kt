package com.oytuns.ikinci_hafta_odevi_mehmet_oytun_sarifakioglu

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_question_answer.*


class QuestionAnswer : Fragment() {

    var getIngWord : String? = ""
    var getTurWordArray : Array<String>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_answer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getIngWord = arguments?.getString("ingWord")
        getTurWordArray = arguments?.getStringArray("turWordArray")
        main_word.setText(getIngWord)
        btnA.setText(getTurWordArray?.get(0))
        btnB.setText(getTurWordArray?.get(1))
        btnC.setText(getTurWordArray?.get(2))
        btnD.setText(getTurWordArray?.get(3))

        startTimer()

    }
    fun startTimer(){
        val timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timer_object.text=(millisUntilFinished/1000).toString()
                progress_circular_object.progress-=5;
            }
            override fun onFinish() {
                timer_object.text="0";
            }
        }
        timer.start()
    }
}