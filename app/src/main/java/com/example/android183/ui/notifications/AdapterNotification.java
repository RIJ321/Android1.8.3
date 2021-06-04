package com.example.android183.ui.notifications;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android183.databinding.NotifItemBinding;
import com.example.android183.ui.dashboard.Modeldash;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterNotification extends RecyclerView.Adapter<AdapterNotification.ViewHolder> {

    private ArrayList<Modeldash> list = new ArrayList<>();

    public void addItems(ArrayList<Modeldash> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(NotifItemBinding.inflate
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
        private NotifItemBinding notificationsBinding;

        public ViewHolder( NotifItemBinding itemView) {
            super(itemView.getRoot());
            notificationsBinding  = itemView;
        }


        public void onBind(Modeldash model) {
            notificationsBinding.tvNotifTime.setText(model.getDescription());
            notificationsBinding.tvNotifTitle.setText(model.getTitle());
            notificationsBinding.likePhoto.setImageResource(model.getImg());
            notificationsBinding.imgLikedPhoto.setImageResource(model.getImgLiked());
        }
    }
}
