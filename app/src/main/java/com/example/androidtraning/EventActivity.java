package com.example.androidtraning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Intent intent = getIntent();
        int age = intent.getIntExtra("age",25);

        Toast.makeText(this, "年齢"+age, Toast.LENGTH_SHORT).show();

        TextView textProfile = findViewById(R.id.textProfile);
        EditText nameText = findViewById(R.id.nameText);
        EditText passText = findViewById(R.id.passText);
        Button clearN = findViewById(R.id.clearN);
        Button clearP = findViewById(R.id.clearP);
        CheckBox check10 = findViewById(R.id.check10);
        CheckBox check20 = findViewById(R.id.check20);
        CheckBox check30 = findViewById(R.id.check30);
        RadioButton radioOtoko = findViewById(R.id.radioOtoko);
        RadioButton radioOnna = findViewById(R.id.radioOnna);
        Button kakuninButton =findViewById(R.id.kakuninButton);

        clearN.setOnClickListener(this);
        clearP.setOnClickListener(this);
        kakuninButton.setOnClickListener(this);

        clearP.set
    }

}