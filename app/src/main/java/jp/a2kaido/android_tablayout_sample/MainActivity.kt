package jp.a2kaido.android_tablayout_sample

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViews()
    }

    fun setViews() {
        var fm = supportFragmentManager
        val viewPager = findViewById(R.id.viewPager) as ViewPager
        val adapter = TabViewPagerAdapter(fm)
        viewPager.adapter = adapter

        val tabLayout = findViewById(R.id.tabLayout) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
    }
}
