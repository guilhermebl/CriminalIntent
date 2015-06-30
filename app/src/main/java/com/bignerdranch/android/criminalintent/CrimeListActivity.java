package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by guilherme on 14/04/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
