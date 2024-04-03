package com.example.adoptaunperrorlopez;

import android.app.Application;

public class AdoptaUnPerroApplication extends Application {

    private Repository repository;

    @Override
    public void onCreate() {
        super.onCreate();
        this.repository = new PerrosRepository();
    }

    public Repository getRepository() {
        return repository;
    }
}
