package com.dimidium.workonintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {

        Button btnGreeting = findViewById(R.id.butt_greeting);
        final EditText txtName = findViewById(R.id.inter_name);
        final TextView txtGreeting = findViewById(R.id.out_greeting);

        btnGreeting.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = txtName.getText().toString();
                    String stringHelow = getString(R.string.say_hallow) + name;
                    txtGreeting.setText(stringHelow);
                }
            });

    }
}