package com.example.adoptaunperrorlopez;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adoptaunperrorlopez.databinding.ActivityDetallePerroBinding;

public class DetallePerroActivity extends AppCompatActivity {

    private ActivityDetallePerroBinding binding; // Variable para el Binding de la vista

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetallePerroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Recibir los datos del perro
        Perro perro = getIntent().getParcelableExtra("perro");

        binding.tvNombre.setText(perro.getNombre());
        binding.tvEdad.setText("Edad: " + perro.getEdad());
        binding.tvRaza.setText("Raza: " + perro.getRaza());
        binding.tvTamano.setText("Tamaño: " + perro.getTamano());
        binding.tvDescripcion.setText("Descripción: " + perro.getDescripcionPerro());
        int resourceId = getResources().getIdentifier(perro.getImagenFondo(), "drawable", getPackageName());
        binding.fondoImageView.setImageResource(resourceId);
    }
}
