package model;

public class Collection {

    private String name_collection;
    private int img_collection;

    public Collection(String name_collection, int img_collection) {
        this.name_collection = name_collection;
        this.img_collection = img_collection;
    }

    public String getName_collection() {
        return name_collection;
    }

    public void setName_collection(String name_collection) {
        this.name_collection = name_collection;
    }

    public int getImg_collection() {
        return img_collection;
    }

    public void setImg_collection(int img_collection) {
        this.img_collection = img_collection;
    }
}
