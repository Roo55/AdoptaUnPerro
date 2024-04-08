package com.example.adoptaunperrorlopez;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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
        holder.btnMasInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetallePerroActivity.class);
                intent.putExtra("perro",perro);
                v.getContext().startActivity(intent);


            }
        });
    }

    class PerroViewHolder extends RecyclerView.ViewHolder{
        private PerroItemBinding itemViewBinding;
        private Button btnMasInformacion;

        public PerroViewHolder(PerroItemBinding itemViewBinding){
                super(itemViewBinding.getRoot());
                this.itemViewBinding = itemViewBinding;
                btnMasInformacion = itemViewBinding.btnMasInformacion;
        }
        public void bind(Perro perro){

            itemViewBinding.tvNombrePerro.setText(perro.getNombre());

            int resourceId = itemView.getContext().getResources().getIdentifier(perro.getImagenFondo(),"drawable",itemView.getContext().getPackageName());
            itemViewBinding.fondoImageView.setImageResource(resourceId);
        }

        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
