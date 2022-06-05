package com.kuliah.tripassistance.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kuliah.tripassistance.R;
import com.kuliah.tripassistance.model.ModelReligi;

import java.util.ArrayList;

public class ListReligiAdapter extends RecyclerView.Adapter<ListReligiAdapter.ReligiViewHolder> {

    private ArrayList<ModelReligi> listWisataReligi;

    public ListReligiAdapter(ArrayList<ModelReligi> listWisataReligi) {
        this.listWisataReligi = listWisataReligi;
    }

    public interface OnClickItemCallBack {
        void onItemClicked (ModelReligi data);
    }

    public void setOnItemClickCallBack(OnClickItemCallBack callBack) {
        this.callBack = callBack;
    }

    private OnClickItemCallBack callBack;

    @NonNull
    @Override
    public ListReligiAdapter.ReligiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_list_religi,parent,false);
        return new ReligiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListReligiAdapter.ReligiViewHolder holder, int position) {
        holder.namaReligi.setText(listWisataReligi.get(position).getNamareligi());
        holder.gambarTempatReligi.setImageResource(listWisataReligi.get(position).getGambartempatreligi());
        holder.namaTempatReligi.setText(listWisataReligi.get(position).getNamatempatreligi());
        holder.descTempatReligi.setText(listWisataReligi.get(position).getDesctempatreligi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.onItemClicked(listWisataReligi.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisataReligi.size();
    }

    class ReligiViewHolder extends RecyclerView.ViewHolder {
        public final TextView namaReligi;
        public final ImageView gambarTempatReligi;
        public final TextView namaTempatReligi;
        public final TextView descTempatReligi;

        public ReligiViewHolder(View view) {
            super(view);
            namaReligi = view.findViewById(R.id.tvKategori);
            gambarTempatReligi = view.findViewById(R.id.imgReligi);
            namaTempatReligi = view.findViewById(R.id.tvReligi);
            descTempatReligi = view.findViewById(R.id.tvDetailReligi);
        }
    }

}