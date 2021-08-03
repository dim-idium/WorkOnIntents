package com.dimidium.workonintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    final static String YOUR_NAME = "YOUR_NAME";
    private EditText txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {

        Button btnGreeting = findViewById(R.id.butt_greeting);
        txtName = findViewById(R.id.inter_name);
        final TextView txtGreeting = findViewById(R.id.out_greeting);

        btnGreeting.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = txtName.getText().toString();
                    String stringHelow = getString(R.string.say_hallow) + name;
                    txtGreeting.setText(stringHelow);
                }
            });

        Button btnAccount = findViewById(R.id.btn_account);
        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);

                intent.putExtra(YOUR_NAME, txtName.getText().toString());
                startActivity(intent);
            }
        });

    }
}