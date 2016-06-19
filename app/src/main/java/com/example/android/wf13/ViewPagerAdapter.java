package com.example.android.wf13;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.content.Context;

/**
 * Created by sonal on 08-06-2016.
 */

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentStatePagerAdapter;


//* Created by sonal on 04-06-2016.
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;


// * Created by hp1 on 21-01-2015.
//*/
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created

    private ContextCompat resources;
    int[] imageResId = {
            R.drawable.mybio,
            R.drawable.biopic,
            R.drawable.peoplefollowed
    };
    private int[] drawablesIds = {
            R.drawable.first_tab_drawable,
            R.drawable.second_tab_drawable,
            R.drawable.first_tab_drawable
    };
    // Context context = this;

    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            home h1 = new home();
            return h1;
        } else if (position == 1) // if the position is 0 we are returning the First tab
        {
            tab1 t1 = new tab1();
            return t1;
        } else if (position == 2)// As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            tab2 t2 = new tab2();
            return t2;
        } else {
            tab3 t3 = new tab3();
            return t3;
        }
    }
    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }

    public ContextCompat getResources() {
        return resources;
    }

    public int getDrawableId(int position) {
        //Here is only example for getting tab drawables
        return drawablesIds[position];
    }
}
