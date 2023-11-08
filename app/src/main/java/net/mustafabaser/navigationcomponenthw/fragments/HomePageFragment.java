package net.mustafabaser.navigationcomponenthw.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.navigationcomponenthw.R;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentHomePageBinding;

public class HomePageFragment extends Fragment {
    private FragmentHomePageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomePageBinding.inflate(inflater, container, false);

        // Go to Fragment A
        binding.buttonGitA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_homePageFragment_to_AFragment);
        });

        // Go to Fragment X
        binding.buttonGitX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_homePageFragment_to_XFragment);
        });

        return binding.getRoot();
    }
}