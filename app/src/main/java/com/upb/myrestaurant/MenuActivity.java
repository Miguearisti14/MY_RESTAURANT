package com.upb.myrestaurant;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MenuActivity extends ListActivity {

    private String [] categoriasProductos = new String[]{"Entradas","Platos fuertes","Bebidas","Postres"};
    private  ListView listaCategorias = null;

    private ListAdapter adaptadorLista = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        listaCategorias = findViewById(android.R.id.list);

        adaptadorLista = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoriasProductos);

        listaCategorias.setAdapter((adaptadorLista));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    protected void onListItemClick(ListView lv, View v, int position, long id){

        super.onListItemClick(lv,v,position,id);
        if(position == 0) {
            Intent i;
            i = new Intent(this, ProductoActivity.class);
            startActivity(i);
        }

        else if(position == 1) {
            Intent i;
            i = new Intent(this, BebidasActivity.class);
            startActivity(i);
        }

        else if(position == 2) {
            Intent i;
            i = new Intent(this, ProductoActivity.class);
            startActivity(i);
        }

        else if(position == 3) {
            Intent i;
            i = new Intent(this, ProductoActivity.class);
            startActivity(i);
        }

    }
}