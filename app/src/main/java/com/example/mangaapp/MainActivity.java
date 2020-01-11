package com.example.mangaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{
    private RecyclerView rvManga;
    private ArrayList<Manga> list = new ArrayList<>();

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        clickSelected(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void clickSelected(int select){
        switch (select){
            case R.id.profile:
                Intent moveIntent = new Intent(MainActivity.this, Profilku.class);
                startActivity(moveIntent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvManga = findViewById(R.id.rv_manga);
        rvManga.setHasFixedSize(true);

        list.addAll(MangaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvManga.setLayoutManager(new LinearLayoutManager(this));
        ListMangaAdapter listMangaAdapter = new ListMangaAdapter(list);
        rvManga.setAdapter(listMangaAdapter);
        listMangaAdapter.setOnItemClickCallback(new ListMangaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Manga data) {
                moveToDetail(data);
            }
        });
    }

    private void moveToDetail(Manga data){
        Intent intent = new Intent(MainActivity.this, DetailManga.class);
        intent.putExtra(DetailManga.EXTRA_TITLE, data.getTitle());
        intent.putExtra(DetailManga.EXTRA_DESCRIPTION, data.getDescription());
        intent.putExtra(DetailManga.EXTRA_COVER, data.getCover());
        intent.putExtra(DetailManga.EXTRA_AUTHOR, data.getAuthor());
        intent.putExtra(DetailManga.EXTRA_PUBLISHER, data.getPublisher());
        intent.putExtra(DetailManga.EXTRA_SALES, data.getSales());
        startActivity(intent);
    }
}
