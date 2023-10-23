package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview_library_save.R;

import java.util.List;

import model.List_save_data;

public class List_save_dataAdapter extends RecyclerView.Adapter<List_save_dataAdapter.ListDataViewHolder>{


    public static final int Type_Recently=1;
    public static final int Type_Collection=2;
    private List<List_save_data> mListData_save;
    private Context mContext;
    public void setData(Context context, List<List_save_data> listDatasave){
        this.mContext = context;
        this.mListData_save = listDatasave;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return mListData_save.get(position).getType();
    }

    @NonNull
    @Override
    public ListDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_save_data,parent,false);
        return new ListDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataViewHolder holder, int position) {

        List_save_data listSaveData = mListData_save.get(position);
        if (listSaveData == null){
            return;
        }
        if (Type_Recently == holder.getItemViewType()){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.VERTICAL,false);
            holder.rcvItem.setLayoutManager(linearLayoutManager);
            holder.rcvItem.setFocusable(false);

            RecentlyAdapter recentlyAdapter = new RecentlyAdapter();
            recentlyAdapter.setData(listSaveData.getListRecently());
            holder.rcvItem.setAdapter(recentlyAdapter);

        }else if(Type_Collection == holder.getItemViewType()){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL,false);
            holder.rcvItem.setLayoutManager(linearLayoutManager);
            holder.rcvItem.setFocusable(false);

            CollectionAdapter collectionAdapter = new CollectionAdapter();
            collectionAdapter.setData(listSaveData.getListCollection());
            holder.rcvItem.setAdapter(collectionAdapter);
        }

    }

    @Override
    public int getItemCount() {
        if (mListData_save != null){
            return mListData_save.size();
        }
        return 0;
    }

    public class ListDataViewHolder extends RecyclerView.ViewHolder{

        private RecyclerView rcvItem;

        public ListDataViewHolder(@NonNull View itemView) {
            super(itemView);
            rcvItem = itemView.findViewById(R.id.rcv_item);
        }
    }
}
