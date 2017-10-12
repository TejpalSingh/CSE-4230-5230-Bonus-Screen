package com.ou.bonusscreen;

/**
 * Created by Tej on 10/11/17.
 */

public class WineModel {

    String name;
    String type;
    int year;
    String discription;
    float glassPrice;
    float bottlePrice;
    boolean bestPrice;
    int thumbnail;

    public WineModel(String name, String type, int year, String discription, float glassPrice, float bottlePrice, boolean bestPrice, int thumbnail) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.discription = discription;
        this.glassPrice = glassPrice;
        this.bottlePrice = bottlePrice;
        this.bestPrice = bestPrice;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public String getDiscription() {
        return discription;
    }

    public float getGlassPrice() {
        return glassPrice;
    }

    public float getBottlePrice() {
        return bottlePrice;
    }

    public boolean isBestPrice() {
        return bestPrice;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
