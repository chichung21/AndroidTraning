package com.example.androidtraning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String[] curryList = {"ドライカレー","カツカレー","チーズカレー","スープカレー"};

        //画面を変数に登録
        Intent preferenceIntent = new Intent(this,PreferencesActivity.class);


        //画面上のパーツを登録
        ListView listView = findViewById(R.id.curryList);

        //配列セット用のアダプター
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,curryList);

        //画面上のListviewにアダプターの配列データ表示
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv = (TextView)view;
                String st = (String) adapterView.getItemAtPosition(i);

                //Toast.makeText(getApplicationContext(), "st", Toast.LENGTH_SHORT).show();
                //i:何番目を選んだか
                Toast.makeText(getApplicationContext(), "st", Toast.LENGTH_SHORT).show();

                //何番目を選んだかを送る
                preferenceIntent.putExtra("curry",i);

                //画面
                startActivity(preferenceIntent);

            }
        });

    }
}