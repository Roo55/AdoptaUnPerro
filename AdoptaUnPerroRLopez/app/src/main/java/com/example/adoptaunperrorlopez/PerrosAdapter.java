package com.example.adoptaunperrorlopez;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PerrosAdapter extends RecyclerView.Adapter< PerrosAdapter.PerroViewHolder > {

    private List<Perro> perros;

    public void submitList(List<Perro> perros){
        this.perros = perros;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PerroViewHolder holder, int position) {

    }

    class PerroViewHolder extends RecyclerView.ViewHolder{


        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
