package com.example.categories;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView modelTitle;
    private ItemClickListener itemClickListener;
  ;


    MyHolder(@NonNull View itemView) {
        super(itemView);
        this.modelTitle = itemView.findViewById(R.id.modelTxt);
        itemView.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());

    }

    void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}