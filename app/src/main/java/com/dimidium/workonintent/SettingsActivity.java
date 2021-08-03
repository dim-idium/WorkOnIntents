package com.dimidium.workonintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        String text = getIntent().getExtras().getString(MainActivity.YOUR_NAME);
        EditText editName = findViewById(R.id.yor_name);
        editName.setText(text);


        Button btnReturn = findViewById(R.id.butt_return);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}