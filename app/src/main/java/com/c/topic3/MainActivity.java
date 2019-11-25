package com.c.topic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView acTextView;
    private String[] batch ={"22a","22b","22c","22d","22d"};
    private Button btnSave;
    private TextView tvname, tvcountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acTextView = findViewById(R.id.acTextView);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.select_dialog_item,
                batch

        );

        acTextView.setAdapter(stringArrayAdapter);
        acTextView.setThreshold(1);



    }
}
