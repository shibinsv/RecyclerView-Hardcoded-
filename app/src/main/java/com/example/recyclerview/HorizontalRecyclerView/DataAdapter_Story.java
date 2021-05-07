package com.example.recyclerview.HorizontalRecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataAdapter_Story extends RecyclerView.Adapter<DataAdapter_Story.ViewHolderStory> {

    private final Context context;
    private final ArrayList<DataClass_Story>arrayList;


    public DataAdapter_Story(Context context, ArrayList<DataClass_Story>arrayList){

        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolderStory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1= LayoutInflater.from(context).inflate(R.layout.story_template,parent,false);
        return new ViewHolderStory(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderStory holder, int position) {
        DataClass_Story dataClass1=arrayList.get(position);
        String name=dataClass1.getName();

        holder.name.setText(name);
        holder.image.setImageResource(dataClass1.getImageURL());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolderStory extends RecyclerView.ViewHolder {
        TextView name;
        CircleImageView image;
        public ViewHolderStory(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            image=itemView.findViewById(R.id.image);
        }
    }
}
