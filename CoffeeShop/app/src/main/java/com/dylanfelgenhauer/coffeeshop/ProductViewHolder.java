package com.dylanfelgenhauer.coffeeshop;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder{
    TextView name;
    TextView cost;
    TextView quantity;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        quantity = itemView.findViewById(R.id.pquantityText);
        name = itemView.findViewById(R.id.pnameText);
        cost = itemView.findViewById(R.id.pcostText);
    }
}
