package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview_library_save.R;

import java.util.List;
import model.Collection;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.CollectionViewHolder>{

    private List<Collection> mListCollection;


    public void setData(List<Collection> list){
        this.mListCollection = list;
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

        Collection collection = mListCollection.get(position);
        if (collection == null){
            return;
        }
        holder.imgCollection.setImageResource(collection.getImg_collection());
        holder.tvCollection.setText(collection.getName_collection());

    }

    @Override
    public int getItemCount() {
        if (mListCollection != null){
            return mListCollection.size();
        }
        return 0;
    }

    public class CollectionViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCollection;
        private TextView tvCollection;

        public CollectionViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCollection = itemView.findViewById(R.id.hinhanh_collection);
            tvCollection = itemView.findViewById(R.id.tenmon_collection);

        }
    }
}
