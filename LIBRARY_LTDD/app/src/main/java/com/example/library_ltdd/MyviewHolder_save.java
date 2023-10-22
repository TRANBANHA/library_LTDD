package com.example.library_ltdd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyviewHolder_save extends RecyclerView.ViewHolder {


    ImageView imageView_bst;
    TextView  tenView_bst;
    public MyviewHolder_save(@NonNull @org.jetbrains.annotations.NotNull View itemView) {


        super(itemView);
        imageView_bst = itemView.findViewById(R.id.hinh_anh_save);
        tenView_bst = itemView.findViewById(R.id.ten_mon_save);
    }
}
