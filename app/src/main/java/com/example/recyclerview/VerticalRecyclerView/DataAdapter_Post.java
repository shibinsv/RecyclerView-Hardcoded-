package com.example.recyclerview.VerticalRecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataAdapter_Post extends RecyclerView.Adapter<DataAdapter_Post.ViewHolderPost> {

    private Context contextPost;
    private ArrayList<DataClass_Post>arrayListPost;

    public DataAdapter_Post(Context contextPost, ArrayList<DataClass_Post> arrayListPost) {
        this.contextPost = contextPost;
        this.arrayListPost = arrayListPost;
    }


    @NonNull
    @Override
    public ViewHolderPost onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View postView= LayoutInflater.from(contextPost).inflate(R.layout.post_layout,parent,false);
        return new ViewHolderPost(postView);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderPost holder, int position) {
        DataClass_Post dataClass_post=arrayListPost.get(position);

        String name=dataClass_post.getProfileName();
        String timeAgo=dataClass_post.getProfileTimeAgo();
        String caption=dataClass_post.getProfileCaption();
        String views=dataClass_post.getViewsCount();
        String updatedTime=dataClass_post.getPostedUpdate();
        String shares=dataClass_post.getShareNumber();
        String loops=dataClass_post.getLoopNumber();
        String comments=dataClass_post.getCommentNumber();

        holder.profileName.setText(name);
        holder.profileTimeAgo.setText(timeAgo);
        holder.profileCaption.setText(caption);
        holder.viewsCount.setText(views);
        holder.postedUpdate.setText(updatedTime);
        holder.shareNumber.setText(shares);
        holder.loopNumber.setText(loops);
        holder.commentNumber.setText(comments);

        holder.PostedImage.setImageResource(dataClass_post.getImageURL1());
        holder.profileSmall.setImageResource(dataClass_post.getImageURL2());

    }

    @Override
    public int getItemCount() {
        return arrayListPost.size();
    }

    public static class ViewHolderPost extends RecyclerView.ViewHolder {

        TextView profileName,profileTimeAgo,profileCaption,viewsCount,postedUpdate,shareNumber,loopNumber,commentNumber;
        ImageView PostedImage;
        CircleImageView profileSmall;
        public ViewHolderPost(@NonNull View itemViewPost) {
            super(itemViewPost);

            profileName=itemViewPost.findViewById(R.id.profileName);
            profileTimeAgo=itemViewPost.findViewById(R.id.profileTimeAgo);
            profileCaption=itemViewPost.findViewById(R.id.profileCaption);
            viewsCount=itemViewPost.findViewById(R.id.viewsCount);
            postedUpdate=itemViewPost.findViewById(R.id.postedUpdate);
            shareNumber=itemViewPost.findViewById(R.id.shareNumber);
            loopNumber=itemViewPost.findViewById(R.id.loopNumber);
            commentNumber=itemViewPost.findViewById(R.id.commentNumber);

            PostedImage=itemViewPost.findViewById(R.id.postedImage);
            profileSmall=itemViewPost.findViewById(R.id.profile);

        }
    }
}
