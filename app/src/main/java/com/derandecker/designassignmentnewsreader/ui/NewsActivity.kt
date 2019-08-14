package com.derandecker.designassignmentnewsreader.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.derandecker.designassignmentnewsreader.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

    }

    //for purposes of debugging the layout, initial code
    //will only start an Intent to a details page which contains static information
    fun imageClick(view: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        startActivity(intent)

    }
}
