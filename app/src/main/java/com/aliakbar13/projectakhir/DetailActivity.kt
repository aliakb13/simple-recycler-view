package com.aliakbar13.projectakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val iem = intent.getParcelableExtra<Iem>(MainActivity.INTENT_PARCELABLE)

        val imgDetail: ImageView = findViewById(R.id.img_detail)
        val detailName: TextView = findViewById(R.id.tv_detail_name)
        val detailPrice: TextView = findViewById(R.id.tv_detail_price)
        val detailIem: TextView = findViewById(R.id.tv_detail_iem)
        val detailSreview: TextView = findViewById(R.id.detail_short)

        if (iem != null) {
            imgDetail.setImageResource(iem.photo)
            detailName.text = iem.name
            detailPrice.text = "Rp${iem.price}"
            detailIem.text = iem.detail
            detailSreview.text = iem.shortReview
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}