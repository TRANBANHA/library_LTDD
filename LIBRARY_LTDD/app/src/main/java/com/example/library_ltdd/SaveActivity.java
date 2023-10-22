package com.example.library_ltdd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class SaveActivity extends AppCompatActivity {

    private Button btnLike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        btnLike = (Button) findViewById(R.id.btn_like2);
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SaveActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //chia cot cho list
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);



        RecyclerView recyclerView1 = findViewById(R.id.recycleview_ganday);

        List<item_list> items_ganday = new ArrayList<item_list>();
        items_ganday.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items_ganday.add(new item_list("Chao ech",R.drawable.suonxaochuangot));



        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(new listAdapter(getApplicationContext(),items_ganday));



        RecyclerView recyclerView_BST = findViewById(R.id.recycleview_bst);

        List<item_list_save> items_bst = new ArrayList<item_list_save>();
        items_bst.add(new item_list_save("Chao ech",R.drawable.suonxaochuangot));
        items_bst.add(new item_list_save("Chao ech",R.drawable.suonxaochuangot));
        items_bst.add(new item_list_save("Chao ech",R.drawable.suonxaochuangot));


        recyclerView_BST.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_BST.setAdapter(new listAdapter_save(getApplicationContext(),items_bst));


        recyclerView_BST.setLayoutManager(gridLayoutManager);
    }


}