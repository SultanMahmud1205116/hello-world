package com.example.nisha.navigationdrawervideotutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Nisha on 4/15/16.
 */
public class CategoryFragment extends Fragment {
    View myView;
    Button asset;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.category, container, false);
        //asset = findViewById(R.id.btnasset);
        return myView;
    }
}
