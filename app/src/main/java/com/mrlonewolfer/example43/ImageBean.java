package com.mrlonewolfer.example43;

import android.os.Parcelable;

public class ImageBean {

 int mImgId;
 String RatingBar;

    public int getmImgId() {
        return mImgId;
    }

    public void setmImgId(int mImgId) {
        this.mImgId = mImgId;
    }

    public String getRatingBar() {
        return RatingBar;
    }

    public void setRatingBar(String ratingBar) {
        RatingBar = ratingBar;
    }

    public ImageBean(int mImgId, String ratingBar) {
        this.mImgId = mImgId;
        RatingBar = ratingBar;
    }
}
