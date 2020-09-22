package com.kcejjh.diaryapp.Activity

import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get
import androidx.core.widget.TextViewCompat
import com.google.android.material.tabs.TabLayout
import com.kcejjh.diaryapp.R
import kotlinx.android.synthetic.main.activity_main.*

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
        lo_tab.addTab(lo_tab.newTab().setText(R.string.tab_diary),0)
        lo_tab.addTab(lo_tab.newTab().setText(R.string.tab_write),1)

        lo_tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }

            override fun onTabUnselected(unSelectTab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab != null) {
                    val linearLayout = (lo_tab.getChildAt(0) as ViewGroup ).getChildAt(tab.position) as LinearLayout
                    (linearLayout.getChildAt(1) as TextView).setTypeface(null,Typeface.BOLD)
                }
            }
        })
    }

}
