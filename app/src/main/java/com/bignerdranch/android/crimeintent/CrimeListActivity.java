package com.bignerdranch.android.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by princess123 on 30/08/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    //@Override
    protected Fragment createFragment() {

        return new CrimeListFragment();
    }
}

