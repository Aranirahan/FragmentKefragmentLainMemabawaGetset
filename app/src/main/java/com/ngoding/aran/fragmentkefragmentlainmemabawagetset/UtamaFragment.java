package com.ngoding.aran.fragmentkefragmentlainmemabawagetset;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class UtamaFragment extends Fragment implements View.OnClickListener {
    public Button btnpanggilFragment;


    public UtamaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_utama, container, false);
        btnpanggilFragment = view.findViewById(R.id.btn_panggil_fragment);
        btnpanggilFragment.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        KeduaFragment mKeduaFragment = new KeduaFragment();
        String dataGetset = "-ini data getset-";
        mKeduaFragment.setData1(dataGetset);

        FragmentManager mFragmentManager = getFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.frame_wadah, mKeduaFragment, KeduaFragment.class.getSimpleName());
        mFragmentTransaction.addToBackStack(null);
        mFragmentTransaction.commit();
    }
}
