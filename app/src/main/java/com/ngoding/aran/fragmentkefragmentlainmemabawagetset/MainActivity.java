package com.ngoding.aran.fragmentkefragmentlainmemabawagetset;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle dataObjek = new Bundle();

        FragmentManager mFragmentManager =getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        UtamaFragment mUtamaFragment = new UtamaFragment();
        mFragmentTransaction.add(R.id.frame_wadah, mUtamaFragment, UtamaFragment.class.getSimpleName());
        mFragmentTransaction.commit();
    }
}
