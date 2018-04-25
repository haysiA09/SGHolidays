package com.example.a16022877.sgholidays;

public class Holiday {
    private String day;
    private String date;
    private boolean img;

    public Holiday (String day,String date, boolean img){
        this.day=day;
        this.date=date;
        this.img=img;
    }

    public String getDay(){return day;}
    public void setDay(String day){this.day=day;}
    public String getDate(){return date;}
    public void setDate(String date){this.date=date;}
    public boolean isImg(){return img;}
    public void setImg(boolean img){this.img=img;}
}
