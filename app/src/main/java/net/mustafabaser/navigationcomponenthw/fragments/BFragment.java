package net.mustafabaser.navigationcomponenthw.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.navigationcomponenthw.R;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentBBinding;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentXBinding;

public class BFragment extends Fragment {
    private FragmentBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater, container, false);

        // Go to Fragment Y
        binding.buttonBGitY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_BFragment_to_YFragment);
        });

        return binding.getRoot();
    }
}