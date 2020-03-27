package com.example.intentsproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class FirstActivity extends AppCompatActivity {

    EditText no1, no2;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        no1 = findViewById(R.id.et1_first);
        no2 = findViewById(R.id.text2_First);
        btnOK = findViewById(R.id.btn1_first);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("number1",no1.getText().toString());
                intent.putExtra("number2", no2.getText().toString());
                startActivity(intent);

                Toast tost = Toast.makeText(getApplicationContext(), "Sending Message", Toast.LENGTH_LONG);
                tost.show();
                tost.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                Toast.makeText(getApplicationContext(), "Sending Message", Toast.LENGTH_LONG).show();
            }
        });
    }
}
