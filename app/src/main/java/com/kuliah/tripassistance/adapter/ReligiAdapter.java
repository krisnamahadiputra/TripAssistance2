package com.kuliah.tripassistance.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.kuliah.tripassistance.R;
import com.kuliah.tripassistance.model.ModelReligi;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

public class ReligiAdapter extends RecyclerView.Adapter<ReligiAdapter.ViewHolder> {

    private List<ModelReligi> items;
    private ReligiAdapter.onSelectData onSelectData;
    private Context mContext;

    public interface onSelectData {
        void onSelected(ModelReligi modelReligi);
    }

    public ReligiAdapter(Context context, List<ModelReligi> items, ReligiAdapter.onSelectData xSelectData) {
        this.mContext = context;
        this.items = items;
        this.onSelectData = xSelectData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_religi, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelReligi data = items.get(position);

        //Get Image
        Glide.with(mContext)
                .load(data.getGambarReligi())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imgReligi);

        holder.tvKategori.setText(data.getKategoriReligi());
        holder.tvReligi.setText(data.getTxtNamaReligi());
        holder.cvReligi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSelectData.onSelected(data);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //Class Holder
    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvKategori;
        public TextView tvReligi;
        public CardView cvReligi;
        public ImageView imgReligi;

        public ViewHolder(View itemView) {
            super(itemView);
            cvReligi = itemView.findViewById(R.id.cvReligi);
            tvReligi = itemView.findViewById(R.id.tvReligi);
            tvKategori = itemView.findViewById(R.id.tvKategori);
            imgReligi = itemView.findViewById(R.id.imgReligi);
        }
    }

}

