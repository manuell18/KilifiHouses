package com.manuellsolutions.kilifihouses;


import android.content.Context;
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
public class HostelFragment extends Fragment {

    int[] hostelImage = {R.drawable.host1, R.drawable.host2,R.drawable.host3,R.drawable.host4,R.drawable.host5,R.drawable.host6};
    String[] hostelNumber = {"H1", "H2", "H3", "H4", "H5", "H6"};
    String[] hostelContactName = {"Manuell Milimo", "Peter and Sons", "Shylla and Daughters", "Swazuri family", "Amina Hamud", "Mohammed Yusuf"};
    String[] hostelContactNumber = {"0798745214", "0786542356", "078446674", "0723760112", "0726067532", "0701820054"};
    String[] hostelPrice = {"8,000", "4,800", "4,300", "5,500", "4,000", "9,000"};


    RecyclerView mRecyclerView;
    BedsitterRecylerAdapter mRecyclerAdapter;
    List<HouseModels> latestList;
    Context mContext;


    public HostelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hostel, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = getActivity().findViewById(R.id.hostelRecycler);
        mContext = getActivity().getApplicationContext();
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        latestList = new ArrayList<>();

        getLatestHouses();

    }

    private void getLatestHouses() {

        for (int i = 0; i<hostelImage.length ; i++){

            HouseModels houseModels = new HouseModels(
                    hostelImage[i],
                    hostelNumber[i],
                    hostelContactName[i],
                    hostelContactNumber[i],
                    hostelPrice[i]
            );
            latestList.add(houseModels);
        }
        mRecyclerAdapter = new BedsitterRecylerAdapter(mContext,latestList);
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }

}
