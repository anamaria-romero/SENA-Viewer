package edu.misena.senaviewer.model;

public class Magazine {
    int id;
    String title;
    int duration;
    short year;
    boolean viewed;
    int timeViewed;
    int sessionNumber;

    public Magazine(String title, int duration, short year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public int getDuration() {
        return id;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    public int getYear() {
        return year;
    }
    public void setYear(short year) {
        this.year = year;
    }


    public boolean isViewed() {
        return viewed;
    }
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}
