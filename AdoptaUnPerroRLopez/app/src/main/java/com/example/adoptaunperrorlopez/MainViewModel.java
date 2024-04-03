package com.example.adoptaunperrorlopez;

import android.app.Application;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    private Repository repository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        AdoptaUnPerroApplication app = getApplication();
        repository =  app.getRepository();
    }

    public List<Perro> findAllPerros(){
        return repository.findAllPerros();
    }

}
