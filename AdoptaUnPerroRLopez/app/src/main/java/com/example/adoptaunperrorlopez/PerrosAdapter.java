package com.example.adoptaunperrorlopez;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adoptaunperrorlopez.databinding.PerroItemBinding;

public class PerrosAdapter extends RecyclerView.Adapter< PerrosAdapter.PerroViewHolder > {

    private List<Perro> perros;

    public void submitList(List<Perro> perros){
        this.perros = perros;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return perros.size();
    }

    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        PerroItemBinding perroViewBinding = PerroItemBinding.inflate(layoutInflater,parent,false);
        return new PerroViewHolder(perroViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PerroViewHolder holder, int position) {
        Perro perro = perros.get(position);
        holder.bind(perro);
    }

    class PerroViewHolder extends RecyclerView.ViewHolder{
        private PerroItemBinding itemViewBinding;

        public PerroViewHolder(PerroItemBinding itemViewBinding){
                super(itemViewBinding.getRoot());
                this.itemViewBinding = itemViewBinding;
        }
        public void bind(Perro perro){

            itemViewBinding.tvNombre.setText(perro.getNombre());
            itemViewBinding.tvEdad.setText(perro.getEdad());
            itemViewBinding.tvRaza.setText(perro.getRaza());
            itemViewBinding.tvTamano.setText(perro.getTamano());

        }

        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
