package com.example.library_ltdd;

public class item_list{

    public String tenMon;
    public int img;

    public item_list(String tenMon, int img) {
        this.tenMon = tenMon;
        this.img = img;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
