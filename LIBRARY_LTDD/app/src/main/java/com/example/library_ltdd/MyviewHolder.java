package com.example.library_ltdd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyviewHolder extends RecyclerView.ViewHolder {


    ImageView imageView;
    TextView  tenView;
    public MyviewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {


        super(itemView);
        imageView = itemView.findViewById(R.id.hinh_anh);
        tenView = itemView.findViewById(R.id.ten_mon);
    }
}
