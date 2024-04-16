package com.example.viewpager2recycleviewadapter;

public class LandScape {
    String landImageFileName;
    String landCaption;

    public LandScape(String landImageFileName, String landCation) {
        this.landImageFileName = landImageFileName;
        this.landCaption = landCation;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
