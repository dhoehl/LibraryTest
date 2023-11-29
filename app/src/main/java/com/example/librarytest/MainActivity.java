package com.example.librarytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.librarytest.databinding.ActivityMainBinding;
import com.mikepenz.aboutlibraries.LibsBuilder;
import com.mikepenz.aboutlibraries.LibsConfiguration;
import com.mikepenz.aboutlibraries.entity.Library;
import com.mikepenz.aboutlibraries.util.SpecialButton;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        //NavigationUI.setupActionBarWithNavController(this, navController);
        //NavigationUI.setupWithNavController(binding.navView, navController);


        binding.btnClicky.setOnClickListener(view ->
                new LibsBuilder()
                        .withAboutIconShown(true)
                        .withAboutVersionShown(true)
                        .withAboutDescription("Some Description")
                        .withAboutSpecial1("Privacy Policy")
                        .withAboutSpecial1Description("Click for special action")
                        //.withEdgeToEdge(true)
                        //.withSearchEnabled(true)
                        //.supportFragment();
                        .start(MainActivity.this));
    }

}