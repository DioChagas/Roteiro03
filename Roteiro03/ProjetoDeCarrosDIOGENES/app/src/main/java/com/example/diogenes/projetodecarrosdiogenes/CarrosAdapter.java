package com.example.diogenes.projetodecarrosdiogenes;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by diogenes on 18/03/16.
 */

public class CarrosAdapter extends RecyclerView.Adapter<CarrosAdapter.CarrosViewHolder> {

    private Context context;
    private List<Carros> carros;
    private CarrosApplication application;


    public CarrosAdapter(Context context) {
        this.context = context;
        application = (CarrosApplication)context.getApplicationContext();
        carros = application.getCarros();
    }

    @Override
    public CarrosAdapter.CarrosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_list_main,viewGroup,false);

        return new CarrosViewHolder(view);
    }

    //@TargetApi(Build.VERSION_CODES.JELLY_BEAN)

    @Override
    public void onBindViewHolder(CarrosAdapter.CarrosViewHolder holder, int position) {
        Carros c = carros.get(position);

        //holder.imgView.setImageResource(c.getIdImageCarro());

        holder.imgView.setImageAlpha(c.getIdImageCarro());
        holder.textView.setText(c.getNomeCarro());

    }

    @Override
    public int getItemCount() {
        return this.carros.size();
    }

    public class CarrosViewHolder extends RecyclerView.ViewHolder {
        private View toqueView;
        private ImageView imgView;
        private TextView textView;

        public CarrosViewHolder(View view) {
            super(view);

            toqueView = itemView.findViewById(R.id.toqueList);
            imgView = (ImageView)itemView.findViewById(R.id.img_list_main);
            textView = (TextView)itemView.findViewById(R.id.text_list_main);

            toqueView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getPosition();
                    application.removerCarros(position);
                    Toast.makeText(context, "Removeu da posição "+ position, Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });

        }
    }
}
