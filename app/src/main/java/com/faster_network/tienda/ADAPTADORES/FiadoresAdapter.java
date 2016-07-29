package com.faster_network.tienda.ADAPTADORES;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.faster_network.tienda.Detallesfiador;
import com.faster_network.tienda.MODELO.Fiador;
import com.faster_network.tienda.R;

import java.util.List;

/**
 * Created by Gebrail on 28/07/2016.
 */
public class FiadoresAdapter  extends RecyclerView.Adapter<FiadoresAdapter.FiadoresViewHolder>
        implements ItemClickListener {


    private List <Fiador> items;

    /*
    Contexto donde actua el recycler view
     */
    private Context context;


    public FiadoresAdapter(List<Fiador> items, Context context) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public FiadoresViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.lista_fiadores, viewGroup, false);
        return new FiadoresViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(FiadoresViewHolder viewHolder, int i) {
        viewHolder.nombre_fiador.setText(items.get(i).getNombre_fiador());
        viewHolder.estado.setText(items.get(i).getEstado());
    }

    /**
     * Sobrescritura del método de la interfaz {@link ItemClickListener}
     *
     * @param view     item actual
     * @param position posición del item actual
     *
     */
    @Override
    public void onItemClick(View view, int position) {
        Detallesfiador.launch(
                (Activity) context, items.get(position).getId_fiador());
    }


    public static class FiadoresViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public  TextView nombre_fiador;
        public  TextView estado;
        public ItemClickListener listener;

        public FiadoresViewHolder(View v, ItemClickListener listener) {
            super(v);
            nombre_fiador =(TextView) v.findViewById(R.id.nombre_fiador);
            estado = (TextView) v.findViewById(R.id.estado);
            this.listener = listener;
            v.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }
}


interface ItemClickListener {
    void onItemClick(View view, int position);
}
