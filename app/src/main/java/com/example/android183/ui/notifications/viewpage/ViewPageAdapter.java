package com.example.android183.ui.notifications.viewpage;

import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.android183.R;

import org.jetbrains.annotations.NotNull;

import java.nio.file.FileStore;
import java.util.ArrayList;

public class ViewPageAdapter extends RecyclerView.Adapter<ViewPageAdapter.ViewPagerHolder> {
    /*
    public void addItems(Fragment fragment) {
        this.list.add(fragment);
        notifyDataSetChanged();
    }
*/
    int[] arr = {R.layout.view_rv, R.layout.view_rv2};


    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv,parent,false);
        return new ViewPagerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewPagerHolder holder, int position) {
        holder.omBind(position);
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }


    public class ViewPagerHolder extends RecyclerView.ViewHolder {
        public ViewPagerHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }

        public void omBind(int position) {

        }
    }
}
