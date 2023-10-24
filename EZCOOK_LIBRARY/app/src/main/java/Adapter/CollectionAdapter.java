package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezcook_library.R;

import java.util.List;

import model.Collection_model;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.CollectionViewHolder>{
    private List<Collection_model> mListCollection;
    public void setData_Collection(List<Collection_model> list_collection){
        this.mListCollection=list_collection;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CollectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_collection,parent,false);

        return new CollectionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionViewHolder holder, int position) {
        Collection_model collectionModel=mListCollection.get(position);
        if (collectionModel==null){
            return;
        }
        holder.img_collection.setImageResource(collectionModel.getImg_mode_collection());
        holder.tv_name_collection.setText(collectionModel.getName_model_collection());
        holder.tv_privacy_collection.setText(collectionModel.getPrivacy_model_collection());
    }

    @Override
    public int getItemCount() {
        if (mListCollection != null){
            return mListCollection.size();
        }
        return 0;
    }

    public class CollectionViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_collection;
        private TextView tv_name_collection;
        private TextView tv_privacy_collection;

        public CollectionViewHolder(@NonNull View itemView) {
            super(itemView);

            //anh xa;
            img_collection = itemView.findViewById(R.id.hinhanh_collection);
            tv_name_collection = itemView.findViewById(R.id.tenmon_collection);
            tv_privacy_collection = itemView.findViewById(R.id.privacy_collection);
        }
    }
}
