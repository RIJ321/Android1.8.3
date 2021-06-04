package com.example.android183.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android183.R;
import com.example.android183.databinding.FragmentDashboardBinding;
import com.example.android183.ui.notifications.AdapterNotification;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private ArrayList<Modeldash> list = new ArrayList<>();
    private AdapterNotification adapterNotification;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapterNotification = new AdapterNotification();
        createContent();
        adapterNotification.addItems(list);
        binding.rvNotifFr.setAdapter(adapterNotification);
    }

    void createContent() {
        for (int i = 0; i < 15; i++) {
            list.add(new Modeldash("Likes", "something", R.drawable.oval, R.drawable.rectangle));
        }
    }
}