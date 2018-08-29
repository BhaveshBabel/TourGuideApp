package com.example.admin.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Location {
    private String restroName;
    private String restroAddress;
    private int ImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String name, String address) {
        restroName = name;
        restroAddress = address;
    }

    public Location(String name, String address, int imageResourceId) {
        restroName = name;
        restroAddress = address;
        ImageResourceId = imageResourceId;
    }

    public String getRestroName() {
        return restroName;
    }

    public String getRestroAddress() {
        return restroAddress;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }
}












