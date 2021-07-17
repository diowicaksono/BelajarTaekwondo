package com.dwiaryantodiowicaksono_3145161971_mobcom.ytapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKyourugiKickAdapter extends RecyclerView.Adapter<ListKyourugiKickAdapter.ListViewHolder> {

    private ArrayList<KyourugiKick> listKyourugiKick;

    //Onclick
    private OnItemClickCallback onItemClickCallback;

    //Onclick Method
    public  void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListKyourugiKickAdapter(ArrayList<KyourugiKick> list){
        this.listKyourugiKick = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kyourugi, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        KyourugiKick kyourugiKick = listKyourugiKick.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kyourugiKick.getPhotoThumbnail())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(kyourugiKick.getName());
        holder.tvDetail.setText(kyourugiKick.getDetail());

        //Onclick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKyourugiKick.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKyourugiKick.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_kyourugi_photo);
            tvName = itemView.findViewById(R.id.tv_kyourugi_name);
            tvDetail = itemView.findViewById(R.id.tv_kyourugi_detail);
        }
    }

    //Onclick interface
    public interface OnItemClickCallback {
        void onItemClicked(KyourugiKick data);
    }
}
