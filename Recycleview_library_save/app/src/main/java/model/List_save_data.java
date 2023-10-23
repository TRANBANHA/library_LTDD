package model;


import java.util.List;

import model.Recently;
import model.Collection;

public class List_save_data {

    private int type;
    private List<Recently> listRecently;
    private List<Collection> listCollection;


    public List_save_data(int type, List<Collection> listCollection) {
        this.type = type;
        this.listCollection = listCollection;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Recently> getListRecently() {
        return listRecently;
    }

    public void setListRecently(List<Recently> listRecently) {
        this.listRecently = listRecently;
    }

    public List<Collection> getListCollection() {
        return listCollection;
    }

    public void setListCollection(List<Collection> listCollection) {
        this.listCollection = listCollection;
    }
}
