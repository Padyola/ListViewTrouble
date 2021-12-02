package com.test.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView listLocais;
    private String[] itens = {
            "Sol nascente", "Ceilandia", "Taguatinga", "Aguas Claras",
            "Guara", "Park sul", "SIA", "Octogonal", "Sudoeste", "Asa sul", "Asa norte",
            "Lago norte", "Sobradinho", "Planaltina", "Planaltina de Goias"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a lista

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adicionar adaptador para a lista

        listLocais.setAdapter(adaptador);

        //Adicionar Clique na lista

        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                String valorSelecionado = listLocais.getItemAtPosition(i).toString();

                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_LONG).show();
            }
        });


    }
}