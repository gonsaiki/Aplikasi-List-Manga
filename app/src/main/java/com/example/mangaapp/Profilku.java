package com.example.mangaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Profilku extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myprofile);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("About Me");
        }
    }

}
