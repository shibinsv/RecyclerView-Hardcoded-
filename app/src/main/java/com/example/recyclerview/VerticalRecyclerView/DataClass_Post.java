package com.example.recyclerview.VerticalRecyclerView;

public class DataClass_Post {

    private String profileName,profileTimeAgo,profileCaption,viewsCount,postedUpdate,shareNumber,loopNumber,commentNumber;
    private int imageURL1,imageURL2;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileTimeAgo() {
        return profileTimeAgo;
    }

    public void setProfileTimeAgo(String profileTimeAgo) {
        this.profileTimeAgo = profileTimeAgo;
    }

    public String getProfileCaption() {
        return profileCaption;
    }

    public void setProfileCaption(String profileCaption) {
        this.profileCaption = profileCaption;
    }

    public String getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(String viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getPostedUpdate() {
        return postedUpdate;
    }

    public void setPostedUpdate(String postedUpdate) {
        this.postedUpdate = postedUpdate;
    }

    public String getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(String shareNumber) {
        this.shareNumber = shareNumber;
    }

    public String getLoopNumber() {
        return loopNumber;
    }

    public void setLoopNumber(String loopNumber) {
        this.loopNumber = loopNumber;
    }

    public String getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(String commentNumber) {
        this.commentNumber = commentNumber;
    }

    public int getImageURL1() {
        return imageURL1;
    }

    public void setImageURL1(int imageURL1) {
        this.imageURL1 = imageURL1;
    }

    public int getImageURL2() {
        return imageURL2;
    }

    public void setImageURL2(int imageURL2) {
        this.imageURL2 = imageURL2;
    }

    public DataClass_Post(String profileName, String profileTimeAgo, String profileCaption, String viewsCount, String postedUpdate, String shareNumber, String loopNumber, String commentNumber, int imageURL1, int imageURL2) {
        this.profileName = profileName;
        this.profileTimeAgo = profileTimeAgo;
        this.profileCaption = profileCaption;
        this.viewsCount = viewsCount;
        this.postedUpdate = postedUpdate;
        this.shareNumber = shareNumber;
        this.loopNumber = loopNumber;
        this.commentNumber = commentNumber;
        this.imageURL1 = imageURL1;
        this.imageURL2 = imageURL2;


    }
}
