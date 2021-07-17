package com.dwiaryantodiowicaksono_3145161971_mobcom.ytapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class Kyourugi extends AppCompatActivity {
    private RecyclerView rvKyourugiKick;
    private ArrayList<KyourugiKick> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyourugi);

        rvKyourugiKick = findViewById(R.id.rv_kyourugi_kick);
        rvKyourugiKick.setHasFixedSize(true);

        list.addAll(KyourugiKickData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKyourugiKick.setLayoutManager(new LinearLayoutManager(this));
        ListKyourugiKickAdapter listKyourugiKickAdapter = new ListKyourugiKickAdapter(list);
        rvKyourugiKick.setAdapter(listKyourugiKickAdapter);

        //Onclick
        listKyourugiKickAdapter.setOnItemClickCallback(new ListKyourugiKickAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(KyourugiKick data) {
                showSelectedKyourugiKick(data);
            }
        });
    }

    //Onclick method
    private void showSelectedKyourugiKick(KyourugiKick kyourugiKick){
        Intent kirimData = new Intent(Kyourugi.this, KyourugiKickDetail.class);
        kirimData.putExtra(KyourugiKickDetail.EXTRA_NAMA, kyourugiKick.getName());
        kirimData.putExtra(KyourugiKickDetail.EXTRA_DETAIL, kyourugiKick.getDetail());
        kirimData.putExtra(KyourugiKickDetail.EXTRA_IMGPOSTER, kyourugiKick.getPhotoPoster());
        startActivity(kirimData);
    }
}