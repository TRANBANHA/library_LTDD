package com.example.ezcook_library;

import static Adapter.f_ListDataAdapter_detail.Type_Step;
import static Adapter.f_ListDataAdapter_detail.Type_ingredient;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.f_ListDataAdapter_detail;
import model.f_ListData_detail;
import model.f_Step_detail;
import model.f_ingredient_detail;

public class f_DetailActivity  extends AppCompatActivity {

    private RecyclerView rcv_detail;
    private f_ListDataAdapter_detail listDataDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_details);


        rcv_detail= findViewById(R.id.rcv_f_detail);
        listDataDetail = new f_ListDataAdapter_detail();

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        rcv_detail.setLayoutManager(linearLayoutManager);

        listDataDetail.setData(this , getList_DetailData());
        rcv_detail.setAdapter(listDataDetail);
}

    private List<f_ListData_detail> getList_DetailData() {
        List<f_ListData_detail> listDataDetails = new ArrayList<>();

        List<f_ingredient_detail> listIng = new ArrayList<>();
        listIng.add(new f_ingredient_detail(R.drawable.thitheo,"Thit heo","500g"));
        listIng.add(new f_ingredient_detail(R.drawable.thitheo,"Thit heo","500g"));
        listIng.add(new f_ingredient_detail(R.drawable.thitheo,"Thit heo","500g"));
        listIng.add(new f_ingredient_detail(R.drawable.thitheo,"Thit heo","500g"));

        List<f_Step_detail> listStep = new ArrayList<>();
        listStep.add(new f_Step_detail("Buoc 1","Chuẩn bị 1 chiếc nồi sạch đổ : 250ml sữa tươi, 250ml sữa đặc, 400ml nước cốt dừa ( 1 lon ) quậy đều tay để các nguyên liệu được hòa với nhau."));
        listStep.add(new f_Step_detail("Buoc 2","Tiếp tục cho dừa tươi nạo sợi, một ít muối vào quậy đều."));
        listStep.add(new f_Step_detail("Buoc 3","Đun hỗn hợp ở lửa trung bình và luôn quậy đều để hỗn hợp không bị cháy"));
        listStep.add(new f_Step_detail("Buoc 4","Khi hỗn hợp sữa được 70°C ta cho 30gr sữa bột vào quậy tan ."));
        listStep.add(new f_Step_detail("Buoc 5"," Đổ 50ml sữa còn lại vào 25gr bột ngô để bột ngô được hòa tan và tiếp tục đổ vào nồi hỗn hợp."));
        listStep.add(new f_Step_detail("Buoc 6","Khi nồi hỗn hợp sôi lục bục ta tắt bếp và để nguội mới đổ vào khuôn kem ."));

        listDataDetails.add(new f_ListData_detail(Type_ingredient, "Nguyên liệu",listIng,null));
        listDataDetails.add(new f_ListData_detail(Type_Step,"Cách làm",null,listStep));


        return listDataDetails;
    }
}
