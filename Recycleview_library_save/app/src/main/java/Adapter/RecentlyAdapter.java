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

import model.Recently;


public class RecentlyAdapter extends RecyclerView.Adapter<RecentlyAdapter.RecenViewHolder>{

    private List<Recently> mListRecently;

    public void setData(List<Recently> list){
        this.mListRecently = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recently,parent,false);

        return new RecenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecenViewHolder holder, int position) {
        Recently recently = mListRecently.get(position);
        if(recently == null){
            return;
        }
        holder.img_Recently.setImageResource(recently.getImg_recently());
        holder.tv_Recently.setText(recently.getName_recently());
    }

    @Override
    public int getItemCount() {
        if (mListRecently !=null) {
            return mListRecently.size();
        }
        return 0;
    }

    public class RecenViewHolder extends RecyclerView.ViewHolder{


        private ImageView img_Recently;
        private TextView tv_Recently;


        public RecenViewHolder(@NonNull View itemView) {
            super(itemView);

            img_Recently = itemView.findViewById(R.id.hinhanh_recently);
            tv_Recently = itemView.findViewById(R.id.tenmon_recently);
        }
    }
}
