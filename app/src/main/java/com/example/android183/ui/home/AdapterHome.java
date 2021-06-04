package com.example.android183.ui.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android183.databinding.HomeItemBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {

    private ArrayList<ModelHome> list = new ArrayList<>();

    public void addItems(ArrayList<ModelHome> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(HomeItemBinding.inflate
                (LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private HomeItemBinding homeItemBinding;

        public ViewHolder( HomeItemBinding itemView) {
            super(itemView.getRoot());
            homeItemBinding  = itemView;
        }


        public void onBind(ModelHome modelHome) {
            homeItemBinding.tvHomeDescription.setText(modelHome.getDescription());
            homeItemBinding.tvHomeTittle.setText(modelHome.getTitle());
            homeItemBinding.homeItemImg.setImageResource(modelHome.getImg());
        }
    }
}
