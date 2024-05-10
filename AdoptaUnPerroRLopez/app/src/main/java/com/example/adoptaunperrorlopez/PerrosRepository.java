package com.example.adoptaunperrorlopez;

import android.content.Context;
import android.util.Log;

import java.util.List;

public class PerrosRepository implements Repository {
    private Context context;
    private List<Perro> perros;
    public PerrosRepository(Context context){
        this.context = context;


    this.perros = List.of(
            new Perro("1", "Max", context.getString(R.string.edad_Max), context.getString(R.string.raza_labrador_retriever), context.getString(R.string.tamano_grande), "labradoretriever", context.getString(R.string.descripcion_perro_max)),
            new Perro("2", "Luna", context.getString(R.string.edad_Luna), context.getString(R.string.raza_golden_retriever), context.getString(R.string.tamano_mediano), "goldenretriever", context.getString(R.string.descripcion_perro_luna)),
            new Perro("3", "Rocky", context.getString(R.string.edad_Rocky), context.getString(R.string.raza_bulldog_frances), context.getString(R.string.tamano_pequeno), "bulldogfrances", context.getString(R.string.descripcion_perro_rocky)),
            new Perro("4", "Buddy", context.getString(R.string.edad_Buddy), context.getString(R.string.raza_pastor_aleman), context.getString(R.string.tamano_grande), "pastoraleman", context.getString(R.string.descripcion_perro_buddy)),
            new Perro("5", "Daisy", context.getString(R.string.edad_Daisy), context.getString(R.string.raza_bichon_frise), context.getString(R.string.tamano_pequeno), "bichonfrise", context.getString(R.string.descripcion_perro_daisy))
    );

    }
    @Override
    public List<Perro> findAllPerros() {
        return perros;
    }
}