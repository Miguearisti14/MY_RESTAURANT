package com.upb.myrestaurant;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class BebidasActivity extends ListActivity {

    public class Producto {
        private String nombreProducto;
        private String ingredientesProducto;
        private String precioProducto;
        private Integer imagenProducto;
    }

    private BebidasActivity.MyAdapter adaptador = null;
    private static ArrayList<BebidasActivity.Producto> arregloProductos = new ArrayList<BebidasActivity.Producto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setData();
        adaptador = new BebidasActivity.MyAdapter(this);
        setListAdapter(adaptador);


        //EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_producto);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //  Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //return insets;
        //});
    }

    private void setData(){
        arregloProductos.clear();


        //Bebida 1
        BebidasActivity.Producto bebidaActual1 = new BebidasActivity.Producto();
        bebidaActual1.nombreProducto = this.getResources().getString(R.string.Bebida1);
        bebidaActual1.ingredientesProducto = this.getResources().getString(R.string.ING_Bebida1);
        bebidaActual1.precioProducto = this.getResources().getString(R.string.PRECIO_Bebida1);
        bebidaActual1.imagenProducto = R.drawable.calificar;
        arregloProductos.add(bebidaActual1);

        //Bebida 2
        BebidasActivity.Producto bebidaActual2 = new BebidasActivity.Producto();
        bebidaActual2.nombreProducto = this.getResources().getString(R.string.Bebida2);
        bebidaActual2.ingredientesProducto = this.getResources().getString(R.string.ING_Bebida2);
        bebidaActual2.precioProducto = this.getResources().getString(R.string.PRECIO_Bebida2);
        bebidaActual2.imagenProducto = R.drawable.calificar;
        arregloProductos.add(bebidaActual2);

        //Bebida 3
        BebidasActivity.Producto bebidaActual3 = new BebidasActivity.Producto();
        bebidaActual3.nombreProducto = this.getResources().getString(R.string.Bebida3);
        bebidaActual3.ingredientesProducto = this.getResources().getString(R.string.ING_Bebida3);
        bebidaActual3.precioProducto = this.getResources().getString(R.string.PRECIO_Bebida3);
        bebidaActual3.imagenProducto = R.drawable.calificar;
        arregloProductos.add(bebidaActual3);

    }

    public static class MyAdapter extends BaseAdapter {

        private Context myContexto;

        public MyAdapter (Context c){
            myContexto = c;
        }

        @Override
        public int getCount(){
            return arregloProductos.size();
        }

        @Override
        public Object getItem(int arg){
            return arregloProductos.get(arg);
        }

        @Override
        public long getItemId(int arg){
            return 0;
        }

        @Override
        public View getView(int position, View vista, ViewGroup arg2){

            View view = null;

            if (vista == null){
                LayoutInflater inflater = (LayoutInflater) myContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.activity_producto, null);
            }
            else {
                view = vista;
            }

            ImageView imgProducto = (ImageView) view.findViewById(R.id.imageViewProducto);
            imgProducto.setImageDrawable(myContexto.getResources().getDrawable(arregloProductos.get(position).imagenProducto));

            TextView nombrePorducto = (TextView) view.findViewById(R.id.textViewNombreProducto);
            nombrePorducto.setText(arregloProductos.get(position).nombreProducto);

            TextView ingredientesPorducto = (TextView) view.findViewById(R.id.textViewIngredientes);
            ingredientesPorducto.setText(arregloProductos.get(position).ingredientesProducto);

            TextView precioPorducto = (TextView) view.findViewById(R.id.textViewPrecioProducto);
            precioPorducto.setText(arregloProductos.get(position).precioProducto);


            return view;
        }

    }

}