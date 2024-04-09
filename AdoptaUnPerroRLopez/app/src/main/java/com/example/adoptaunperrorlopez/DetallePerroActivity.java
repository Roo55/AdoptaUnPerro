package com.example.adoptaunperrorlopez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adoptaunperrorlopez.databinding.ActivityDetallePerroBinding;

public class DetallePerroActivity extends AppCompatActivity {

    private ActivityDetallePerroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetallePerroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Perro perro = getIntent().getParcelableExtra("perro");

        binding.tvNombre.setText(perro.getNombre());
        binding.tvEdad.setText("Edad: " + perro.getEdad());
        binding.tvRaza.setText("Raza: " + perro.getRaza());
        binding.tvTamano.setText("Tamaño: " + perro.getTamano());
        binding.tvDescripcion.setText("Descripción: " + perro.getDescripcionPerro());
        binding.tvDeseasInformacion.setText("¿Deseas más información sobre " + perro.getNombre() +"?");

        int resourceId = getResources().getIdentifier(perro.getImagenFondo(), "drawable", getPackageName());
        binding.fondoImageView.setImageResource(resourceId);

        binding.btnInformacionAdoptarPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetallePerroActivity.this,FormularioAdoptarPerroActivity.class);
                intent.putExtra("perroDetalle",perro);
                startActivity(intent);
            }
        });
    }
}
