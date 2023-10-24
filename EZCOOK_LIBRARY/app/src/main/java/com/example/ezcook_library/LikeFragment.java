package com.example.ezcook_library;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Adapter.LikeAdapter;
import model.Like_model;

public class LikeFragment extends Fragment {

private RecyclerView rcvLike;
private View mviewLike;

    public LikeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mviewLike = inflater.inflate(R.layout.fragment_like, container, false);

        rcvLike = mviewLike.findViewById(R.id.rcv_Like);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rcvLike.setLayoutManager(linearLayoutManager);

        LikeAdapter likeAdapter =  new LikeAdapter();
        likeAdapter.setData(getListLike());

        rcvLike.setAdapter(likeAdapter);



        return mviewLike;
    }

    private List<Like_model> getListLike(){
        List<Like_model> list =new ArrayList<>();
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.canhchua, "Canh chua ca loc"));
        list.add(new Like_model(R.drawable.lauthai, "Lau Thai"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.canhchua, "Canh chua ca loc"));
        list.add(new Like_model(R.drawable.lauthai, "Lau Thai"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.canhchua, "Canh chua ca loc"));
        list.add(new Like_model(R.drawable.lauthai, "Lau Thai"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));
        list.add(new Like_model(R.drawable.suonxaochuangot, "Suon Rim"));

        return list;
    }
}