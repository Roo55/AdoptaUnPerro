package com.example.adoptaunperrorlopez;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;




import com.example.adoptaunperrorlopez.databinding.ActivityFormularioAdoptarPerroBinding;

public class FormularioAdoptarPerroActivity extends AppCompatActivity {

    private ActivityFormularioAdoptarPerroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormularioAdoptarPerroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Perro perro = getIntent().getParcelableExtra("perroDetalle");

        binding.tvInfoPerro.setText(getString(R.string.texto_inicio_formulario)+" " +perro.getNombre());

        binding.etNombre.setText(getString(R.string.nombre_formulario));
        binding.etApellidos.setText(getString(R.string.apellidos_formulario));
        binding.etTelefono.setText(getString(R.string.telefono_formulario));
        binding.etCorreo.setText(getString(R.string.email_formulario));
        binding.etPresentacion.setText(getString(R.string.texto_presentacion));
        binding.btnEnviar.setText(getString(R.string.boton_enviar_formulario));

        binding.btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validarFormulario()){
                    enviarFormulario();
                }
            }
        });


    }

    private boolean validarFormulario(){
        String nombre = binding.etNombre.getText().toString();
        String apellidos = binding.etApellidos.getText().toString();
        String telefono = binding.etTelefono.getText().toString();
        String correo = binding.etCorreo.getText().toString();
        String textoPresentacion = binding.etPresentacion.getText().toString();

        if (TextUtils.isEmpty(nombre)) {
            binding.etNombre.setError(getString(R.string.error_nombre));
            binding.etNombre.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(apellidos)) {
            binding.etApellidos.setError(getString(R.string.error_apellidos));
            binding.etApellidos.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(telefono)) {
            binding.etTelefono.setError(getString(R.string.error_telefono));
            binding.etTelefono.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(correo)) {
            binding.etCorreo.setError(getString(R.string.error_correo));
            binding.etCorreo.requestFocus();
            return false;
        }

        if(TextUtils.isEmpty(textoPresentacion)){
            binding.etPresentacion.setError(getString(R.string.error_presentacion));
            binding.etPresentacion.requestFocus();
            return false;
        }

        if (!numeroTelefonoValido(telefono)) {
            binding.etTelefono.setError(getString(R.string.error_telefono_valido));
            binding.etTelefono.requestFocus();
            return false;
        }

        if (!correoValido(correo)) {
            binding.etCorreo.setError(getString(R.string.error_correo_valido));
            binding.etCorreo.requestFocus();
            return false;
        }



        return true;


    }

    private boolean numeroTelefonoValido(String telefono){
        String regex = "(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}";

        return telefono.matches(regex);
    }

    private boolean correoValido(String correo){
        String regex = "[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}";

        return correo.matches(regex);

    }

    private void enviarFormulario(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}