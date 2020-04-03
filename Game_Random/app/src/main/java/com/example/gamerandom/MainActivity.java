package com.example.gamerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtResult, txtNumber, txtMin, txtMax;
    Button button;
    EditText editMax, editMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getMax = editMax.getText().toString().trim();
                String getMin = editMin.getText().toString().trim();
                if (getMax.equals("") || getMin.equals("")) {
                    Toast.makeText(MainActivity.this, "Ban phai dien day du thong tin", Toast.LENGTH_SHORT).show();
                } else {
                    int max = Integer.parseInt(getMax);
                    int min = Integer.parseInt(getMin);
                    if (max > min) {
                        Random random = new Random();
                        int score = min + random.nextInt(max - min + 1);
                        txtNumber.setText(score + "");
                    } else {
                        Toast.makeText(MainActivity.this, "So thu 1 phai lon hon so thu 2", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void AnhXa() {
        txtResult = (TextView) findViewById(R.id.txtResult);
        txtMax = (TextView) findViewById(R.id.txtMax);
        txtMin = (TextView) findViewById(R.id.txtMin);
        txtNumber = (TextView) findViewById(R.id.txtNumber);
        editMax = (EditText) findViewById(R.id.editMax);
        editMin = (EditText) findViewById(R.id.editMin);
        button = (Button) findViewById(R.id.button);
    }

}
