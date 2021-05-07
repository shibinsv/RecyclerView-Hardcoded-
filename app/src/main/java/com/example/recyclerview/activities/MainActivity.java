package com.example.recyclerview.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.VideoView;

import com.example.recyclerview.R;
import com.example.recyclerview.HorizontalRecyclerView.DataAdapter_Story;
import com.example.recyclerview.HorizontalRecyclerView.DataObject_Story;
import com.example.recyclerview.VerticalRecyclerView.DataAdapter_Post;
import com.example.recyclerview.VerticalRecyclerView.DataObject_Post;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView1,recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        //Story
        DataObject_Story dataObject_story=new DataObject_Story();
        DataAdapter_Story adapterStory=new DataAdapter_Story(this,dataObject_story.getData());
        recyclerView1.setAdapter(adapterStory);


        //Post
        DataObject_Post dataObject_post=new DataObject_Post();
        DataAdapter_Post adapterPost=new DataAdapter_Post(this,dataObject_post.postData());
        recyclerView2.setAdapter(adapterPost);



    }

    private void initView() {

        recyclerView1=findViewById(R.id.recyclerView1);
        recyclerView2=findViewById(R.id.recyclerView2);

    }
}