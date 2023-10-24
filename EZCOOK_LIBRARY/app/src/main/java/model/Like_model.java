package model;

public class Like_model {

    private int img_mode_like;
    private String name_model_like;

    public Like_model(int img_mode_like, String name_model_like) {
        this.img_mode_like = img_mode_like;
        this.name_model_like = name_model_like;
    }

    public int getImg_mode_like() {
        return img_mode_like;
    }

    public void setImg_mode_like(int img_mode_like) {
        this.img_mode_like = img_mode_like;
    }

    public String getName_model_like() {
        return name_model_like;
    }

    public void setName_model_like(String name_model_like) {
        this.name_model_like = name_model_like;
    }
}
