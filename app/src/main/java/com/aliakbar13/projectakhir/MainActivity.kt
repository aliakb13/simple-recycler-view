package com.aliakbar13.projectakhir

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvIem: RecyclerView
    private val list: ArrayList<Iem> = arrayListOf()
    private var title: String = "Rekomendasi IEM"

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        val splash = installSplashScreen()

        setContentView(R.layout.activity_main)

        rvIem = findViewById(R.id.rv_iem)
        rvIem.setHasFixedSize(true)

        list.addAll(IemData.listData)
        setActionBarTitle(title)

        showRecylerView()

    }

    private fun showRecylerView() {
        rvIem.layoutManager = GridLayoutManager(this, 2)
        rvIem.adapter = CardViewIemAdapter(list){
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when(itemId) {
            R.id.about -> {
                val intent = Intent(this@MainActivity,AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }


}