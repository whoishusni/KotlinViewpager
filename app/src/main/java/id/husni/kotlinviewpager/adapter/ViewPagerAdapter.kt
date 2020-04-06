package id.husni.kotlinviewpager.adapter

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import id.husni.kotlinviewpager.R
import id.husni.kotlinviewpager.fragment.CallFragment
import id.husni.kotlinviewpager.fragment.ChatFragment
import id.husni.kotlinviewpager.fragment.StatusFragment

class ViewPagerAdapter(private val context : Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    @StringRes
    private val PAGE_TITLE = intArrayOf(R.string.chat, R.string.status, R.string.call)
    override fun getItem(position: Int): Fragment {
        var fragment : Fragment? = null
        when(position){
            0 -> fragment = ChatFragment()
            1 -> fragment = StatusFragment()
            2 -> fragment = CallFragment()

        }
        return fragment as Fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(PAGE_TITLE[position])
    }

    override fun getCount(): Int {
        return 3
    }
}