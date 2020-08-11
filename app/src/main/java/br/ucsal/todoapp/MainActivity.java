package br.ucsal.todoapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this );
        textView.setText("Hello World");


        this.setContentView(R.layout.activity_main);

        List<String> tarefas = new ArrayList<>(Arrays.asList("Acordar", "Estudar", "Trabalhar", "Dormir"));

        ListView listView = findViewById(R.id.lista);

        ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, tarefas);

        listView.setAdapter(listAdapter);

        Toast.makeText(this,"Hello World!", Toast.LENGTH_LONG).show();
    }

}
