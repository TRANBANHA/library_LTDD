package com.example.ezcook_library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.LikeAdapter;
import Adapter.SaveAdapter;
import model.Save_model;

public class SaveFragment extends Fragment {

    private RecyclerView rcvSave;
    private View mviewSave;
    public SaveFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mviewSave = inflater.inflate(R.layout.fragment_save, container, false);

        rcvSave = mviewSave.findViewById(R.id.rcv_Save);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rcvSave.setLayoutManager(linearLayoutManager);

        SaveAdapter saveAdapter =  new SaveAdapter();
        saveAdapter.setData(getListSave());

        rcvSave.setAdapter(saveAdapter);



        return mviewSave;
    }
    private List<Save_model> getListSave(){
        List<Save_model> list_save=new ArrayList<>();
        list_save.add(new Save_model(R.drawable.lauthai,"Lau thai"));
        list_save.add(new Save_model(R.drawable.canhchua,"Canh ca"));
        list_save.add(new Save_model(R.drawable.suonxaochuangot,"Suon rim me"));
        list_save.add(new Save_model(R.drawable.lauthai,"Lau ca"));
        list_save.add(new Save_model(R.drawable.lauthai,"Lau thai"));
        list_save.add(new Save_model(R.drawable.canhchua,"Canh ca"));
        list_save.add(new Save_model(R.drawable.suonxaochuangot,"Suon rim me"));
        list_save.add(new Save_model(R.drawable.lauthai,"Lau ca"));
        list_save.add(new Save_model(R.drawable.lauthai,"Lau thai"));
        list_save.add(new Save_model(R.drawable.canhchua,"Canh ca"));
        list_save.add(new Save_model(R.drawable.suonxaochuangot,"Suon rim me"));
        list_save.add(new Save_model(R.drawable.lauthai,"Lau ca"));

        return list_save;
    }
}
