package com.example.ezcook_library;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.CollectionAdapter;
import Adapter.LikeAdapter;
import model.Collection_model;

public class CollectionFragment extends Fragment {

    private RecyclerView rcvCollection;
    private View mviewCollection;
private Button btn_create;

    public CollectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mviewCollection = inflater.inflate(R.layout.fragment_collection, container, false);

        rcvCollection = mviewCollection.findViewById(R.id.rcv_Collection);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rcvCollection.setLayoutManager(linearLayoutManager);

        CollectionAdapter collectionAdapter=  new CollectionAdapter();
        collectionAdapter.setData_Collection(getListCollection());

        rcvCollection.setAdapter(collectionAdapter);
        //chia cot
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        rcvCollection.setLayoutManager(gridLayoutManager);



        return mviewCollection;
    }
    private List<Collection_model> getListCollection(){
        List<Collection_model> list_col = new ArrayList<>();

        list_col.add(new Collection_model(R.drawable.canhchua,"An vat","Chỉ mình tôi"));
        list_col.add(new Collection_model(R.drawable.lauthai,"Món chính","Công khai"));
        list_col.add(new Collection_model(R.drawable.suonxaochuangot,"N","Chỉ mình tôi"));
        list_col.add(new Collection_model(R.drawable.canhchua,"An vat","Chỉ mình tôi"));
        list_col.add(new Collection_model(R.drawable.lauthai,"Món chính","Công khai"));
        list_col.add(new Collection_model(R.drawable.suonxaochuangot,"N","Chỉ mình tôi"));
        list_col.add(new Collection_model(R.drawable.canhchua,"An vat","Chỉ mình tôi"));
        list_col.add(new Collection_model(R.drawable.lauthai,"Món chính","Công khai"));
        list_col.add(new Collection_model(R.drawable.suonxaochuangot,"N","Chỉ mình tôi"));
        return list_col;
    }
}