package com.example.mangaapp;

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

public class ListMangaAdapter extends RecyclerView.Adapter<ListMangaAdapter.ListViewHolder> {

    public interface OnItemClickCallback {
        void onItemClicked(Manga data);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    private ArrayList<Manga> listManga;

    public ListMangaAdapter(ArrayList<Manga> list){
        this.listManga = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_manga, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Manga manga = listManga.get(position);
        Glide.with(holder.itemView.getContext())
                .load(manga.getCover())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgCover);
        holder.tvTitle.setText(manga.getTitle());
        holder.tvDesc.setText(manga.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listManga.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listManga.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCover;
        TextView tvTitle, tvDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCover = itemView.findViewById(R.id.img_preview_cover);
            tvTitle = itemView.findViewById(R.id.tv_manga_title);
            tvDesc = itemView.findViewById(R.id.tv_manga_desc);
        }
    }
}

