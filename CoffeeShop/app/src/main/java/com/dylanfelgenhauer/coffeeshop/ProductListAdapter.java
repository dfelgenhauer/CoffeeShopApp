package com.dylanfelgenhauer.coffeeshop;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private ArrayList<Product> pList;
    private MainScreenActivity mainAct;

    public ProductListAdapter(MainScreenActivity mainAct, ArrayList<Product> oList) {
        this.pList = pList;
        this.mainAct = mainAct;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_view, parent, false);
        itemView.setOnClickListener(mainAct);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product p = pList.get(position);
        holder.name.setText(p.getName());
        holder.cost.setText(p.getCost().toString());
        holder.quantity.setText(p.getQuantity());
    }

    @Override
    public int getItemCount() {
        return pList.size();
    }
}
