package com.piyushmaheswari.retrofitdemo;

import android.media.Image;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

public class Hero
{

    private TextView d;
    private Image i;

    private TextView d21;
    private Image i3;

    ImageView kk;
    MediaStore.Video.Media f;

    private TextView dd2s1;
    private Image i3ss;

    private TextView d2s1;
    private Image i3s;

    private String dd;
    private String id;

    private TextView d5;
    private Image i5;

    private TextView d53;
    private Image i55;



    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createdby;
    private String publisher;
    private String imageurl;
    private String bio;

    public Hero(String name, String realname, String team, String firstappearance, String createdby, String publisher, String imageurl, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }
}
