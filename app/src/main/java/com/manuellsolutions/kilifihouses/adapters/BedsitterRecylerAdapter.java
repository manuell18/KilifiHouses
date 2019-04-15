package com.manuellsolutions.kilifihouses.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.manuellsolutions.kilifihouses.R;
import com.manuellsolutions.kilifihouses.dataModels.HouseModels;

import java.util.List;
import java.util.zip.Inflater;

public class BedsitterRecylerAdapter  extends RecyclerView.Adapter<BedsitterRecylerAdapter.ViewHolder> {

    Context mContext;
    List<HouseModels> mHouseList;

    public BedsitterRecylerAdapter(Context mContext, List<HouseModels> mHouseList) {
        this.mContext = mContext;
        this.mHouseList = mHouseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.card_house,viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        HouseModels latestHouses = mHouseList.get(i);

        int houseImageUrl = latestHouses.getHouseImageUrl();
        String houseNumber = latestHouses.getHouseNumber();
        String houseContactName = latestHouses.getHouseContactName();
        String houseContactNumber = latestHouses.getHouseContactNumber();
        String housePrice = latestHouses.getHousePrice();

        Glide.with(mContext)
                .load(houseImageUrl)
                .into(viewHolder.mHouseImage);
        viewHolder.mHouseNumber.setText(String.format("House Number: %s", houseNumber));
        viewHolder.mHousePrice.setText(String.format("Price:  Ksh %s", housePrice));
        viewHolder.mHouseContact.setText(String.format("%s %s", "Contact: " , houseContactNumber));


    }

    @Override
    public int getItemCount() {
        return mHouseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mHouseImage;
        TextView mHouseNumber;
        TextView mHousePrice;
        TextView mHouseContact;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mHouseImage = itemView.findViewById(R.id.houseImage);
            mHouseNumber = itemView.findViewById(R.id.houseNumber);
            mHousePrice = itemView.findViewById(R.id.housePrice);
            mHouseContact = itemView.findViewById(R.id.houseContact);
        }
    }
}
