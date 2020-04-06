package id.husni.kotlinviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.husni.kotlinviewpager.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //set Toolbar
        setSupportActionBar(tBar)
        //setup viewpager with adapter
        vPager.adapter = ViewPagerAdapter(this,supportFragmentManager)
        //setup tab layout with viewpager
        tabLay.setupWithViewPager(vPager)
    }
}
