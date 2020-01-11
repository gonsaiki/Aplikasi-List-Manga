package com.example.mangaapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailManga extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_DESCRIPTION = "extra_description";
    public static final String EXTRA_COVER = "extra_cover";
    public static final String EXTRA_AUTHOR = "extra_author";
    public static final String EXTRA_PUBLISHER = "extra_publisher";
    public static final String EXTRA_SALES = "extra_sales";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_manga);


        TextView judulManga = findViewById(R.id.judul_manga);
        TextView deskripsiManga = findViewById(R.id.deskripsi_manga);
        ImageView gambarManga = findViewById(R.id.gambar_manga);
        TextView authorManga = findViewById(R.id.author_manga);
        TextView publisher = findViewById(R.id.publisher);
        TextView sales = findViewById(R.id.sales);


        Glide.with(this).load(getIntent().getIntExtra(EXTRA_COVER,0)).into(gambarManga);
        judulManga.setText(getIntent().getStringExtra(EXTRA_TITLE));
        deskripsiManga.setText(getIntent().getStringExtra(EXTRA_DESCRIPTION));
        authorManga.setText(getIntent().getStringExtra(EXTRA_AUTHOR));
        publisher.setText(getIntent().getStringExtra(EXTRA_PUBLISHER));
        sales.setText(getIntent().getStringExtra(EXTRA_SALES));

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_TITLE));
        }


    }

}
