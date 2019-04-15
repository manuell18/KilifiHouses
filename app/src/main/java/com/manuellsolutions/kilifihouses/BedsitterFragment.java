package com.manuellsolutions.kilifihouses;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manuellsolutions.kilifihouses.adapters.BedsitterRecylerAdapter;
import com.manuellsolutions.kilifihouses.dataModels.HouseModels;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BedsitterFragment extends Fragment {

    RecyclerView mRecyclerView;
    BedsitterRecylerAdapter mRecyclerAdapter;
    List<HouseModels> latestList;
    Context mContext;

    public BedsitterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bedsitter, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = getActivity().findViewById(R.id.bedsitterRecycler);
        mContext = getActivity().getApplicationContext();
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        latestList = new ArrayList<>();

        getLatestHouses();

    }

    private void getLatestHouses() {

        for (int i = 0; i<10 ; i++){
            HouseModels houseModels = new HouseModels(
                    R.drawable.wiz,
                    "10",
                    "Manu",
                    "0790 689 222",
                    "30,000"
            );
            latestList.add(houseModels);
        }
        mRecyclerAdapter = new BedsitterRecylerAdapter(mContext,latestList);
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }
}
