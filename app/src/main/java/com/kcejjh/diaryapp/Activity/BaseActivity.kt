package com.kcejjh.diaryapp.Activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun toast(msg:String){
        Toast.makeText(this@BaseActivity,msg,Toast.LENGTH_LONG).show()
    }
}