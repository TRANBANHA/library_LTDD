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

import model.Like_model;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.LikeViewHolder>{

    private List<Like_model> mListLike;
    public void setData(List<Like_model> list_like){
        this.mListLike = list_like;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public LikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_like,parent,false);
        return  new LikeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LikeViewHolder holder, int position) {
        Like_model likeModel=mListLike.get(position);
        if (likeModel == null){
            return;
        }
        holder.img_like.setImageResource(likeModel.getImg_mode_like());
        holder.tv_Like.setText(likeModel.getName_model_like());
    }

    @Override
    public int getItemCount() {
        if (mListLike != null){
            return mListLike.size();
        }
        return 0;
    }

    public class LikeViewHolder extends RecyclerView.ViewHolder{

    private ImageView img_like;
    private TextView tv_Like;

        public LikeViewHolder(@NonNull View itemView) {
            super(itemView);


            //anh xa
            img_like = itemView.findViewById(R.id.hinhanh_like);
            tv_Like = itemView.findViewById(R.id.tenmon_like);

        }
    }
}
