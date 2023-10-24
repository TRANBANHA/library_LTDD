package model;

public class Save_model {
    private int img_model_save;
    private String name_model_save;

    public Save_model(int img_model_save, String name_model_save) {
        this.img_model_save = img_model_save;
        this.name_model_save = name_model_save;
    }

    public int getImg_model_save() {
        return img_model_save;
    }

    public void setImg_model_save(int img_model_save) {
        this.img_model_save = img_model_save;
    }

    public String getName_model_save() {
        return name_model_save;
    }

    public void setName_model_save(String name_model_save) {
        this.name_model_save = name_model_save;
    }
}
