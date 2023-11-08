package net.mustafabaser.navigationcomponenthw.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.navigationcomponenthw.R;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentABinding;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentBBinding;

public class AFragment extends Fragment {

    private FragmentABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater, container, false);

        // Go to Fragment B
        binding.buttonGitA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_AFragment_to_BFragment);
        });

        return binding.getRoot();
    }
}