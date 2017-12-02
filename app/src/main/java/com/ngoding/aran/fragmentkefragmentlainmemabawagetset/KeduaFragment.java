package com.ngoding.aran.fragmentkefragmentlainmemabawagetset;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class KeduaFragment extends Fragment {
    public TextView tvTampilDataGetSet;

    private String data1;
    public String getData1() {
        return data1;
    }
    public void setData1(String data1) {
        this.data1 = data1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kedua, container, false);
        tvTampilDataGetSet = view.findViewById(R.id.tv_tampil_data_getset);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvTampilDataGetSet.setText(getData1());
    }
}
