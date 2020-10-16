package com.example.categories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private Context c;
    private ArrayList<Model> models;


    // create constructor class
    MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
// convert XML to OBJ
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_item, null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
// create bind view/data
        holder.modelTitle.setText(models.get(position).getTitle());



        // handle item click
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                switch (models.get(pos).getTitle()) {
                    case "Your Title 0":
// Open New Activity
                        Intent zero = new Intent(c, Mathematics.class);
                        c.startActivity(zero);
                        break;
                    case "Your Title 1":
// Open New Activity
                        Intent one = new Intent(c, Codelabs.class);
                        c.startActivity(one);
                        break;
                    case "Your Title 2":
// Open New Activity
                        Intent two = new Intent(c, Two.class);
                        c.startActivity(two);
                        break;
                    case "Your Title 3": {
// Open New Activity
                        Intent three = new Intent(c, Three.class);
                        c.startActivity(three);
                        break;
                    }
                    case "Your Title 4": {
// Open New Activity
//Intent five = new Intent(c, Five.class);
//c.startActivity(five);
                        break;
                    }
                    case "Your Title 5": {
// Open New Activity
//Intent six = new Intent(c, Six.class);
//c.startActivity(six);
                        break;
                    }
                    case "Your Title 6": {
// Open New Activity
//Intent seven = new Intent(c, Seven.class);
//c.startActivity(seven);
                        break;
                    }
                    case "Your Title 7": {
// Open New Activity
//Intent eight = new Intent(c, Eight.class);
//c.startActivity(eight);
                        break;
                    }
                    case "Your Title 8": {
// Open New Activity
//Intent nine = new Intent(c, Nine.class);
//c.startActivity(nine);
                        break;
                    }
                    case "Your Title 9": {
// Open New Activity
//Intent ten = new Intent(c, Ten.class);
//c.startActivity(ten);
                        break;
                    }
                    case "Your Title 10": {
// Open New Activity
//Intent eleven = new Intent(c, Eleven.class);
//c.startActivity(eleven);
                        break;
                    }
                    case "Your Title 11": {
// Open New Activity
//Intent twelve = new Intent(c, Twelve.class);
//c.startActivity(twelve);
                        break;
                    }
                }


            }
        });

    }
    @Override
    public int getItemCount() {
        return models.size();
    }
}