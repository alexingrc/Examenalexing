package com.example.erlin.examenalexing;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ListViewAdapter adapter;

    ListView list;
    String[] restaurantes = new String[]{
            "aji S/ 13.00 ",
            "cuy S/5.00 ",
            "escabeche S/12.00 ",
            "juane S/5.00 ",
            "pescado S/10.00 ",
            "pizza S/34.00 "
    };
    int[] img = {
            R.drawable.aji,
            R.drawable.cuy,
            R.drawable.saltado,
            R.drawable.pescado,
            R.drawable.juane,
            R.drawable.pizza
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listas);
        ArrayAdapter adapters = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurantes);
        list.setAdapter(adapters);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {

                switch (posicion) {
                    case 0 :
                        Intent aa = new Intent(getApplicationContext(), aji.class);
                        startActivity(aa);
                        break;
                    case 1 :
                        Intent aaa = new Intent(getApplicationContext(),Cuy.class);
                        startActivity(aaa);

                        break;
                    case 2:
                        Intent aaaa = new Intent(getApplicationContext(), escabeche.class);
                        startActivity(aaaa);

                        break;
                    case 3 :
                        Intent aaaaa = new Intent(getApplicationContext(), juane.class);
                        startActivity(aaaaa);

                        break;
                    case 4 :
                        Intent aaaaaa = new Intent(getApplicationContext(), pescado.class);
                        startActivity(aaaaaa);

                        break;
                    case 5 :
                        Intent aaaaaaa = new Intent(getApplicationContext(), pizza.class);
                        startActivity(aaaaaaa);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final ListView list = (ListView) findViewById(R.id.listas);
        adapter = new ListViewAdapter(this, restaurantes, img);
        list.setAdapter(adapter);


        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Inicio");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Platos1");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Platos2");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                return true;
            case R.id.reporte:

                return true;
            case R.id.cl:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Cliente", Toast.LENGTH_SHORT);
                toast1.show();
                return true;
            case R.id.pr:
                Toast toast2 = Toast.makeText(getApplicationContext(), "Producto", Toast.LENGTH_SHORT);
                toast2.show();

                return true;
            case R.id.ca:
                Toast toast3 = Toast.makeText(getApplicationContext(), "Categoria", Toast.LENGTH_SHORT);
                toast3.show();
                return true;
            case R.id.ve:
                Toast toast4 = Toast.makeText(getApplicationContext(), "Vendedor", Toast.LENGTH_SHORT);
                toast4.show();
                return true;
            case R.id.rp:
                Toast toast5 = Toast.makeText(getApplicationContext(), "Reporte Producto", Toast.LENGTH_SHORT);
                toast5.show();
                return true;
            case R.id.rv:
                Toast toast6 = Toast.makeText(getApplicationContext(), "Reporte Ventas", Toast.LENGTH_SHORT);
                toast6.show();

                return true;


            default:   return super.onOptionsItemSelected(item);
        }
    }

    public void cuy (View view) {
        startActivity(new Intent(this, Cuy.class));
    }
    public void aji (View view) {
        startActivity(new Intent(this, aji.class));
    }
    public void escabeche (View view) {
        startActivity(new Intent(this, escabeche.class));
    }
    public void juane (View view) {
        startActivity(new Intent(this, juane.class));
    }

    public void pescado (View view) {
        startActivity(new Intent(this, pescado.class));
    }
    public void pizza (View view) {
        startActivity(new Intent(this, pizza.class));
    }
}
