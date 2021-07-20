package com.lemsicode.fakestagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Post> posts = new DataHelper().initializeData();
        initRecyclerView(posts);
    }

    private void initRecyclerView(ArrayList<Post> posts) {

        RecyclerView rvPosts = findViewById(R.id.rv_posts);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvPosts.setLayoutManager(manager);
        rvPosts.setAdapter(new FakestaAdapter(posts));
    }
}