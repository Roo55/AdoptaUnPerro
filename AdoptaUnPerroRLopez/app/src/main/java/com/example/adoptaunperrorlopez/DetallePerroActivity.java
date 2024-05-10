package com.example.adoptaunperrorlopez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adoptaunperrorlopez.databinding.ActivityDetallePerroBinding;

public class DetallePerroActivity extends AppCompatActivity {

    private ActivityDetallePerroBinding binding;
    private boolean textViewsVisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetallePerroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Perro perro = getIntent().getParcelableExtra("perro");

        binding.tvNombre.setText(perro.getNombre());
        binding.tvEdad.setText(getString(R.string.edad_detalle)+ ": " + perro.getEdad());
        binding.tvRaza.setText(getString(R.string.raza_detalle)+ ": " + perro.getRaza());
        binding.tvTamano.setText(getString(R.string.tamano_detalle)+ ": " + perro.getTamano());
        binding.tvDescripcion.setText(getString(R.string.descripcion_detalle)+ ": " + perro.getDescripcionPerro());
        binding.tvDeseasInformacion.setText(getString(R.string.deseas_mas_informacion));

        int resourceId = getResources().getIdentifier(perro.getImagenFondo(), "drawable", getPackageName());
        binding.fondoImageView.setImageResource(resourceId);

        binding.btnInformacionAdoptarPerro.setText(R.string.boton_mas_informacion);
        binding.btnInformacionAdoptarPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetallePerroActivity.this,FormularioAdoptarPerroActivity.class);
                intent.putExtra("perroDetalle",perro);
                startActivity(intent);
            }
        });

        binding.btnToggleVisibility.setText(R.string.boton_ocultar_mostrar_detalles);
        binding.btnToggleVisibility.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                toggleTextViewVisibility();

                return true;
            }
        });
    }

    private void toggleTextViewVisibility() {

        if (textViewsVisible) {
            hacerTvInvisibles();
        } else {
            hacerTvVisibles();
        }
    }

    private void hacerTvInvisibles() {
        binding.tvNombre.setVisibility(View.INVISIBLE);
        binding.tvEdad.setVisibility(View.INVISIBLE);
        binding.tvRaza.setVisibility(View.INVISIBLE);
        binding.tvTamano.setVisibility(View.INVISIBLE);
        binding.tvDescripcion.setVisibility(View.INVISIBLE);
        binding.tvDeseasInformacion.setVisibility(View.INVISIBLE);
        binding.btnInformacionAdoptarPerro.setVisibility(View.INVISIBLE);

        textViewsVisible = false;
    }

    private void hacerTvVisibles() {
        binding.tvNombre.setVisibility(View.VISIBLE);
        binding.tvEdad.setVisibility(View.VISIBLE);
        binding.tvRaza.setVisibility(View.VISIBLE);
        binding.tvTamano.setVisibility(View.VISIBLE);
        binding.tvDescripcion.setVisibility(View.VISIBLE);
        binding.tvDeseasInformacion.setVisibility(View.VISIBLE);
        binding.btnInformacionAdoptarPerro.setVisibility(View.VISIBLE);

        textViewsVisible = true;
    }
}
