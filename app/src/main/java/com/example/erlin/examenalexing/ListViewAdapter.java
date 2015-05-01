package com.example.erlin.examenalexing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Erlin on 01/05/2015.
 */
public class ListViewAdapter extends BaseAdapter {

    Context context;
    String[] titulos;
    int[] img;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] titulos, int[] imagenes) {
        this.context = context;
        this.titulos = titulos;
        this.img = imagenes;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        TextView txtTitle;
        ImageView imgImg;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        txtTitle = (TextView) itemView.findViewById(R.id.list_row_t);
        imgImg = (ImageView) itemView.findViewById(R.id.list_row_i);

        // Capture position and set to the TextViews
        txtTitle.setText(titulos[position]);
        imgImg.setImageResource(img[position]);

        return itemView;
    }
}
