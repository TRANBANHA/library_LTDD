package com.example.recycleview_library_save;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.List_save_dataAdapter;
import model.Collection;
import model.List_save_data;
import model.Recently;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvData_save;

    private List_save_dataAdapter listSaveDataAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvData_save = findViewById(R.id.rcv_data_save);
        listSaveDataAdapter = new List_save_dataAdapter();

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        rcvData_save.setLayoutManager(linearLayoutManager);

        listSaveDataAdapter.setData(this , getList_saveDatas());
        rcvData_save.setAdapter(listSaveDataAdapter);

    }

    private List<List_save_data> getList_saveDatas() {
        List<List_save_data> listSaveData = new ArrayList<>();
        List<Recently> listRecently = new ArrayList<>();
        listRecently.add(new Recently("suon xao chua ngot",R.drawable.suonxaochuangot));
        listRecently.add(new Recently("suon Rim",R.drawable.suonxaochuangot));
        listRecently.add(new Recently("Canh chua",R.drawable.suonxaochuangot));

        List<Collection> listCollection = new ArrayList<>();
        listCollection.add(new Collection("Mon ngon",R.drawable.suonxaochuangot));
        listCollection.add(new Collection("N",R.drawable.suonxaochuangot));
        listCollection.add(new Collection("An Vat",R.drawable.suonxaochuangot));
        listCollection.add(new Collection("Mon Phuc tap",R.drawable.suonxaochuangot));
        listCollection.add(new Collection("Mon ngon",R.drawable.suonxaochuangot));



        listSaveData.add(new List_save_data(List_save_dataAdapter.Type_Recently,null,listRecently));
        listSaveData.add(new List_save_data(List_save_dataAdapter.Type_Collection,listCollection,null));
        return listSaveData;
    }
}