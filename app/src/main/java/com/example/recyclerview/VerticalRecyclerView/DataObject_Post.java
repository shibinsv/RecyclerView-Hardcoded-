package com.example.recyclerview.VerticalRecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class DataObject_Post {

    public DataObject_Post(){

    }
    public ArrayList<DataClass_Post>postData(){

        ArrayList<DataClass_Post>arrayListPost=new ArrayList<>();

        arrayListPost.add(new DataClass_Post("Maalavika mohanan","5 minutes ago","Chilling!",
                "5,34,454 views","Yesterday","5.5K",
                "2.8K","1.2K",
                R.drawable.malavila_profile,R.drawable.malavila_profile));
        arrayListPost.add(new DataClass_Post("Silk","1 hour ago","Bliss",
                "5.4M Views","Today","121K",
                "55K","87.2K",
                R.raw.video,R.drawable.avatar_1));
        arrayListPost.add(new DataClass_Post("Arya Stark","3 days ago","I'm a girl",
                "5000 views","3 days ago","700",
                "425","86",
                R.drawable.arya,R.drawable.dpseven));


        return arrayListPost;
    }

}
