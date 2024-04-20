package com.example.mystockapplication.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mystockapplication.R;

public class PortHHeaderViewHolder extends RecyclerView.ViewHolder {
    final public TextView item;
    public PortHHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        item = itemView.findViewById(R.id.title);
    }
}
