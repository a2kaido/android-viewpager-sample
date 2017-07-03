package jp.a2kaido.android_tablayout_sample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by anikaido on 2017/07/03.
 */
class TabViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> {
                return TabFragment()
            }
            1 -> {
                return TabFragment()
            }
            2 -> {
                return TabFragment()
            }
        }
        return null
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return (position + 1).toString()
    }
}