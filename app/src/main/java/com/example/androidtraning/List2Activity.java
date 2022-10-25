package com.example.androidtraning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class List2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        Intent intentSub = new Intent(this,SubActivity.class);
        Intent intentEvent = new Intent(this,EventActivity.class);

        ListView listView = findViewById(R.id.viewLst);
        EditText data = findViewById(R.id.data);
        Button data2 = findViewById(R.id.data2);

        ArrayList<String> dataList = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dataList);

        listView.setAdapter(adapter);

        data2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tT = data.getText(),toString();
                if (!tT.equals("")){
                    dataList.add(tT);

                    ListView.setAdapter(adapter);

                    data.setText("");
                }
            }
        });
            listView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(AdapterView<?> adapterView,View view, int i,long l) {
                    switch (i%2){
                        case 1:
                            startActivity(intentEvent);
                            break;
                        case 0:
                            startActivity(intentSub);
                            break;
                    }

                }
            });

    }
}