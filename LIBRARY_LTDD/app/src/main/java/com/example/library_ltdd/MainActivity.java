package com.example.library_ltdd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
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

public class MainActivity extends AppCompatActivity {
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSave = (Button) findViewById(R.id.btn_save1);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SaveActivity.class);
                startActivity(intent);
            }
        });




        RecyclerView recyclerView1 = findViewById(R.id.recycleview);

        List<item_list> items = new ArrayList<item_list>();
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));
        items.add(new item_list("Chao ech",R.drawable.suonxaochuangot));

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(new listAdapter(getApplicationContext(),items));


    }


}