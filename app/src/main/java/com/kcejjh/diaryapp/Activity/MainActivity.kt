package com.kcejjh.diaryapp.Activity

import android.os.Bundle
import com.kcejjh.diaryapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.include_tab.*
import kotlinx.android.synthetic.main.include_tab.view.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setToolbar()
        setTabLayout()
    }

    /**
     * jhChoi - 20200922
     * Toolbar Setting
     * */
    private fun setToolbar() {
        setSupportActionBar(tb_main)
        supportActionBar?.setTitle("")
    }

    /**
     * jhChoi - 20200922
     * TabLayout Setting
     * */
    private fun setTabLayout() {
       toast("")
    }

}
