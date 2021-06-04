package com.example.android183.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android183.R;
import com.example.android183.databinding.FragmentNotificationsBinding;
import com.example.android183.databinding.FragmentPostsBinding;
import com.example.android183.ui.notifications.viewpage.PostsFragment;
import com.example.android183.ui.notifications.viewpage.ProfileFragment;
import com.example.android183.ui.notifications.viewpage.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {
    private ViewPageAdapter viewPageAdapter;
    private FragmentNotificationsBinding binding;
    private String[] setText = {"JKLdfj", "JJ"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPageAdapter = new ViewPageAdapter();
        binding.viewPager2.setAdapter(viewPageAdapter);

    }
}