package net.mustafabaser.navigationcomponenthw.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mustafabaser.navigationcomponenthw.R;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentXBinding;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentYBinding;

public class XFragment extends Fragment {
    private FragmentXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentXBinding.inflate(inflater, container, false);

        // Go to Fragment Y
        binding.buttonGitY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_homePageFragment_to_XFragment);
        });

        return binding.getRoot();
    }
}