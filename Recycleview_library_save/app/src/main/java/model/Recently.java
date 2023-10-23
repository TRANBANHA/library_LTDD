package model;

public class Recently {
    private String name_recently;
    private int img_recently;

    public Recently(String name_recently, int img_recently) {
        this.name_recently = name_recently;
        this.img_recently = img_recently;
    }

    public String getName_recently() {
        return name_recently;
    }

    public void setName_recently(String name_recently) {
        this.name_recently = name_recently;
    }

    public int getImg_recently() {
        return img_recently;
    }

    public void setImg_recently(int img_recently) {
        this.img_recently = img_recently;
    }
}
