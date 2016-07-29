package com.faster_network.tienda;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.faster_network.tienda.MODELO.Producto;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.squareup.picasso.Picasso;
import org.json.JSONArray;
import org.json.JSONException;
import cz.msebera.android.httpclient.Header;
import static com.faster_network.tienda.OPERACION.Lkproducto.productoo;

public class SecondActivity extends AppCompatActivity {
    private ListView lista;
    public static Producto pr;
    private static String lacategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            lacategoria = extras.getString("DATO");
        }
        lista = (ListView) findViewById(R.id.ListView_listado);
        descargarproductos();
    /*    lista.setAdapter(new Lista_adaptador(getApplicationContext(), R.layout.activity_main_productos, productoo,lacategoria) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                    if (texto_superior_entrada != null)
                        texto_superior_entrada.setText(((Producto) entrada).getNombre_producto());

                    TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                    if (texto_inferior_entrada != null)
                        texto_inferior_entrada.setText(((Producto) entrada).getPrecio());


                    if (imagen_entrada != null)
                        Picasso.with(SecondActivity.this).load("http://faster-network.com/tienda/Views/template/imagenes/" + ((Producto) entrada).getImagen()).into(imagen_entrada);
                }
            }
        });
        lista.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                Producto elegido = (Producto) pariente.getItemAtPosition(posicion);
                CharSequence texto = elegido.getNombre_producto() + ": " + elegido.getPrecio();
                Toast toast = Toast.makeText(SecondActivity.this, texto, Toast.LENGTH_LONG);
                toast.show();
            }
        });*/


        lista.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                pr = (Producto) productoo.get(posicion);
                Toast toast = Toast.makeText(SecondActivity.this, pr.getNombre_producto() +" : " + pr.getPrecio(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }


    public void descargarproductos() {
        productoo.clear();
        final ProgressDialog progressDialog = new ProgressDialog(SecondActivity.this);
        progressDialog.setMessage("Cargando Datos...");
        progressDialog.show();
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://faster-network.com/L/querypro.php", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200) {
                    progressDialog.dismiss();
                    try {
                        JSONArray jsonArray = new JSONArray(new String(responseBody));
                        for (int i = 0; i < jsonArray.length(); i++) {
                            String id_producto = jsonArray.getJSONObject(i).getString("id_producto");
                            String nombre_producto = jsonArray.getJSONObject(i).getString("nombre_producto");
                            String descripcion_producto = jsonArray.getJSONObject(i).getString("descripcion_producto");
                            String imagen = jsonArray.getJSONObject(i).getString("imagen");
                            String precio = jsonArray.getJSONObject(i).getString("precio");
                            String id_categoria = jsonArray.getJSONObject(i).getString("id_categoria");
                            if (id_categoria.equalsIgnoreCase(lacategoria)) {
                                Producto X = new Producto(id_producto, nombre_producto, descripcion_producto, imagen, precio, id_categoria);
                                productoo.add(X);
                            }
                        }
                        lista.setAdapter(new Listado(getApplicationContext()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

    public class Listado extends BaseAdapter {
        Context ctx;
        TextView texto_superior_entrada;
        TextView texto_inferior_entrada;
        ImageView imagen_entrada;
        LayoutInflater layoutInflater;

        public Listado(Context applicationContext) {
            this.ctx = applicationContext;
            layoutInflater = (LayoutInflater) ctx.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return productoo.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.activity_main_productos, null);
            texto_superior_entrada = (TextView) viewGroup.findViewById(R.id.textView_superior);
            texto_inferior_entrada = (TextView) viewGroup.findViewById(R.id.textView_inferior);
            imagen_entrada = (ImageView) viewGroup.findViewById(R.id.imageView_imagen);
            pr = (Producto) productoo.get(position);
            texto_superior_entrada.setText(pr.getNombre_producto());
            texto_inferior_entrada.setText(pr.getPrecio());
          Picasso.with(SecondActivity.this).load("http://faster-network.com/tienda/Views/template/imagenes/" + pr.getImagen()).into(imagen_entrada);
            return viewGroup;
        }

    }

}