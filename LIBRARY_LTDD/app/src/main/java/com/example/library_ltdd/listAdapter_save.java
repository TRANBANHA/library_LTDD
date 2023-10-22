package com.example.library_ltdd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listAdapter_save extends RecyclerView.Adapter<MyviewHolder_save> {

    Context context_bst;
    List<item_list_save> items_bst;

    public listAdapter_save(Context context_bst, List<item_list_save> items_bst) {
        this.context_bst = context_bst;
        this.items_bst = items_bst;
    }

    @NonNull
    @Override
    public MyviewHolder_save onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyviewHolder_save(LayoutInflater.from(context_bst).inflate(R.layout.activity_view_ds_bst,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder_save holder, int position) {
        holder.tenView_bst.setText(items_bst.get(position).getTenBst());
        holder.imageView_bst.setImageResource(items_bst.get(position).getImg_bst());
    }

    @Override
    public int getItemCount() {
        return items_bst.size();
    }
}
