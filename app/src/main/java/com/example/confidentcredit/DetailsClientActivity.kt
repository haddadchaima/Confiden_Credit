package com.example.confidentcredit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class DetailsClientActivity : AppCompatActivity() {

    private lateinit var tabs: TabLayout
    private lateinit var ptitle: TextView
    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapters: PagerAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_client)

        viewPager = findViewById(R.id.pagerView_tab)
        tabs = findViewById(R.id.tabLayout_details)

        pagerAdapters = PagerAdapters(supportFragmentManager)
        /**set Fragment List*/
        pagerAdapters.addFragment(ClientCreditFragment(),"Crédit")
        pagerAdapters.addFragment(ClientInfoFragment(),"Info")
        tabs!!.tabGravity = TabLayout.GRAVITY_FILL
        /** set view page adapter*/
        viewPager.adapter = pagerAdapters

        /** set tabs*/
        tabs.setupWithViewPager(viewPager)
//        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_search)


        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }
}
