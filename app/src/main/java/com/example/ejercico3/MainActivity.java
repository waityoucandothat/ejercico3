package com.example.ejercico3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import com.google.android.material.snackbar.Snackbar;

import java.lang.reflect.Array;

import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String[] listitas={"carne asada","pastor","pollo","aguja","tripa","campechano"};
       //se agrego el contexto al list view
        final ListView lista=new ListView(this);
        setContentView(lista);

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,R.layout.mi_renglon,R.id.mi_texto,listitas);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Snackbar.make(adapterView,("$"+floor(Math.random())),Snackbar.LENGTH_SHORT).show();

            }
        });
        ArrayAdapter<String>=new ArrayAdapter<String>(this, 0, listitas) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                String =listitas[position];


                switch (position){
                    case 0{ 
                      getDrawable(R.drawable.taco1)
                    }


                break
                }
    }
}
