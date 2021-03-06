package com.app.islam.perantara;

import android.content.Context;

import com.app.islam.perantara.chapter4.ChapterFour1Fragment;
import com.app.islam.perantara.chapter4.ChapterFour3Fragment;
import com.app.islam.perantara.chapter4.ChapterFour4Fragment;
import com.app.islam.perantara.chapter4.ChapterFour5Fragment;
import com.app.islam.perantara.chapter4.ChapterFourDoneFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ChapterFourPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 6; // Defining how many page in this chapter for the Viewpager
    private Context context;

    ChapterFourPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ChapterWelcomeFragment();
        } else if (position == 1) {
            return new ChapterFour5Fragment();
        } else if (position == 2) {
            return new ChapterFour3Fragment();
        } else if (position == 3) {
            return new ChapterFour4Fragment();
        } else if (position == 4) {
            return new ChapterFour1Fragment();
        } else {
            return new ChapterFourDoneFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
