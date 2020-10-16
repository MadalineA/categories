package com.example.categories;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

// RecyclerView
        RecyclerView mRecyclerView = findViewById(R.id.myRecycler);
// Set its Properties
//grid view with 2 columns in each row
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
// Adapter
        MyAdapter mAdapter = new MyAdapter(this, getModels());
        mRecyclerView.setAdapter(mAdapter);
    }

   

    private ArrayList<Model> getModels() {
        ArrayList<Model> models = new ArrayList<>();
        Model p;

        // Create item zero
        p = new Model();
        p.setTitle("Your Title 0");
        models.add(p);

        // Create item one
        p = new Model();
        p.setTitle("Your Title 1");
        models.add(p);

        // Create item two
        p = new Model();
        p.setTitle("Your Title 2");
        models.add(p);

        // Create item three
        p = new Model();
        p.setTitle("Your Title 3");
        models.add(p);

        // Create item four
        p = new Model();
        p.setTitle("Your Title 4");
        models.add(p);

        // Create item five
        p = new Model();
        p.setTitle("Your Title 5");
        models.add(p);

        // Create item six
        p = new Model();
        p.setTitle("Your Title 6");
        models.add(p);

        // Create item seven
        p = new Model();
        p.setTitle("Your Title 7");
        models.add(p);

        // Create item eight
        p = new Model();
        p.setTitle("Your Title 8");
        models.add(p);

        // Create item nine
        p = new Model();
        p.setTitle("Your Title 9");
        models.add(p);

        // Create item ten
        p = new Model();
        p.setTitle("Your Title 10");
        models.add(p);

        // Create item eleven
        p = new Model();
        p.setTitle("Your Title 11");
        models.add(p);

        // Create item twelve
        p = new Model();
        p.setTitle("Your Title 12");
        models.add(p);


        return models;
    }
}