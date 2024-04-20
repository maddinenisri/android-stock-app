package com.example.mystockapplication.holders;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StockItemListHolder extends RecyclerView.ViewHolder{

    final public RecyclerView stock_recyclerview;
    final public Context context;

    public StockItemListHolder(@NonNull View itemView, Context context1) {
        super(itemView);

        context = context1;
        stock_recyclerview = (RecyclerView)itemView;
        stock_recyclerview.setLayoutManager(new LinearLayoutManager(context1));

    }
}
