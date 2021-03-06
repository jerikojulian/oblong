package com.example.oblong.myapplication;

/**
 * Created by Jupe Taek on 10/6/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class Pager extends FragmentStatePagerAdapter{

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
//                return new tab1();
                return new AddOrder();
            case 1:
                return new ListOrder();
//                tab2 tab2 = new tab2();
//                return tab2;
            case 2:
                return new ListKeuangan();
//                tab3 tab3 = new tab3();
//                return tab3;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}