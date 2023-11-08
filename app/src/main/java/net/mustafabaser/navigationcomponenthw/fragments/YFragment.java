package net.mustafabaser.navigationcomponenthw.fragments;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import net.mustafabaser.navigationcomponenthw.R;
import net.mustafabaser.navigationcomponenthw.databinding.FragmentYBinding;

public class YFragment extends Fragment {
    private FragmentYBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentYBinding.inflate(inflater, container,false);
        navController = NavHostFragment.findNavController(this);

        // Back-Button Function
        OnBackPressedCallback backButton = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                setEnabled(false);
                NavController navController = NavHostFragment.findNavController(YFragment.this);
                navController.navigate(R.id.action_YFragment_to_homePageFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), backButton);

        return binding.getRoot();
    }
}