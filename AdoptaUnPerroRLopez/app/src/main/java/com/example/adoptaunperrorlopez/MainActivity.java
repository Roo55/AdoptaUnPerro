package com.example.adoptaunperrorlopez;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.adoptaunperrorlopez.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewBinding;
    private MainViewModel viewModel;
    private PerrosAdapter adapter = new PerrosAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate( this.getLayoutInflater() );
        setContentView( viewBinding.getRoot() );

        this.viewModel = new ViewModelProvider(this).get( MainViewModel.class );

        viewBinding.listaPerros.setAdapter( adapter );
        adapter.submitList(viewModel.findAllPerros());

    }
}