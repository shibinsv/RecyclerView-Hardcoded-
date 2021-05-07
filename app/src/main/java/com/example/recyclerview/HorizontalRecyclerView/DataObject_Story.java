package com.example.recyclerview.HorizontalRecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class DataObject_Story {

    public DataObject_Story(){}

    public ArrayList<DataClass_Story>getData(){

        ArrayList<DataClass_Story>arrayList=new ArrayList<>();
        arrayList.add(new DataClass_Story("Isack",R.drawable.dp));
        arrayList.add(new DataClass_Story("Sarah",R.drawable.dptwo));
        arrayList.add(new DataClass_Story("Maha",R.drawable.dpthree));
        arrayList.add(new DataClass_Story("Jennifer",R.drawable.dpfour));
        arrayList.add(new DataClass_Story("Priya Sweety",R.drawable.dpfive));
        arrayList.add(new DataClass_Story("Deepak",R.drawable.dpsix ));
        arrayList.add(new DataClass_Story("Sanju",R.drawable.dpseven));
        arrayList.add(new DataClass_Story("Silhoutte",R.drawable.dpeight));
        arrayList.add(new DataClass_Story("Baskar",R.drawable.dpnine));
        arrayList.add(new DataClass_Story("Deva",R.drawable.dpten));


        return arrayList;
    }
}
