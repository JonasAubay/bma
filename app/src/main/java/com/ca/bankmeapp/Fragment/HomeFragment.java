package com.ca.bankmeapp.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ca.bankmeapp.R;

/**
 * Created by jevenisse on 29/02/2016.
 */
public class HomeFragment extends Fragment{

    public static final String TAG = HomeFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.content_main, container, false);
    }
}
