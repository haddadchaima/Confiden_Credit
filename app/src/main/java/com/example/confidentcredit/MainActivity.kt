package com.example.confidentcredit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.creditor_home.*

class MainActivity : AppCompatActivity() {

    private var context : Context = applicationContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_client)
        /*bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false*/
        crd_total_credit.setOnClickListener(View.OnClickListener {
            var intent = Intent(context, DetailsClientActivity::class)
            startActivity(intent)
        })
    }
}
