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
import model.Save_model;

public class SaveAdapter extends RecyclerView.Adapter<SaveAdapter.SaveViewHolder>{

    private List<Save_model> mListSave;

    public void setData(List<Save_model> list_save){
        this.mListSave = list_save;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public SaveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_save,parent,false);
        return  new SaveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SaveViewHolder holder, int position) {
        Save_model saveModel=mListSave.get(position);
        if (saveModel == null){
            return;
        }
        holder.img_Save.setImageResource(saveModel.getImg_model_save());
        holder.tv_Save.setText(saveModel.getName_model_save());
    }

    @Override
    public int getItemCount() {
        if (mListSave != null){
            return mListSave.size();
        }
        return 0;
    }

    public class SaveViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_Save;
        private TextView tv_Save;


        public SaveViewHolder(@NonNull View itemView) {
            super(itemView);

            img_Save=itemView.findViewById(R.id.img_save);
            tv_Save=itemView.findViewById(R.id.name_save);
        }
    }
}
