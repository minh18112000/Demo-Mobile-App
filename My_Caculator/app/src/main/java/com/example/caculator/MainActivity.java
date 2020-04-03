package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonXoaHet, buttonXoa, buttonPhanTram, buttonChia, buttonNhan,
            button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button0, buttonCong, buttonTru, buttonResult, buttonDoiDau, buttonCham;
    CheckBox ck1, ck2;
    TextView txtNumber1, txtNumber2, txtOperator,txtResult;
    static String number1 = "", number2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ck1.isChecked()) ck2.setChecked(false);
            }
        });
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ck2.isChecked()) ck1.setChecked(false);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("0"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("0"));
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("1"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("1"));
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("2"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("2"));
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("3"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("3"));
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("4"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("4"));
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("5"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("5"));
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("6"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("6"));
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("7"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("7"));
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("8"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("8"));
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("9"));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("9"));
                }
            }
        });
        buttonCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.concat("."));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.concat("."));
                }
            }
        });
        buttonXoaHet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    txtNumber1.setText("");
                }
                if (ck2.isChecked()) txtNumber2.setText("");
            }
        });

        buttonXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    txtNumber1.setText(currentNumber1.substring(0, currentNumber1.length() - 1));
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    txtNumber2.setText(currentNumber2.substring(0, currentNumber2.length() - 1));
                }
            }
        });

        buttonPhanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    double phanTramNumber1 = Double.parseDouble(currentNumber1) * 0.01;
                    txtNumber1.setText(phanTramNumber1 + "");
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    double phanTramNumber2 = Double.parseDouble(currentNumber2) * 0.01;
                    txtNumber1.setText(phanTramNumber2 + "");
                }
            }
        });
        buttonNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperator.setText("*" + "");
            }
        });
        buttonChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperator.setText(":" + "");
            }
        });
        buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperator.setText("+" + "");
            }
        });
        buttonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperator.setText("-" + "");
            }
        });

        buttonDoiDau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    String currentNumber1 = txtNumber1.getText().toString();
                    Double number1 = Double.parseDouble(currentNumber1);
                    number1 = number1 * (-1);
                    txtNumber1.setText(String.valueOf(number1) + "");
                }
                if (ck2.isChecked()) {
                    String currentNumber2 = txtNumber2.getText().toString();
                    Double number2 = Double.parseDouble(currentNumber2);
                    number2 = number2 * (-1);
                    txtNumber2.setText(String.valueOf(number2) + "");
                }
            }
        });
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNumber1.length() > 0 && txtNumber2.length() > 0) {
                    Double result = .0;
                    String currentNumber1 = txtNumber1.getText().toString();
                    Double number1 = Double.parseDouble(currentNumber1);
                    String currentNumber2 = txtNumber2.getText().toString();
                    Double number2 = Double.parseDouble(currentNumber2);
                    String operator = txtOperator.getText().toString();
                    switch (operator) {
                        case "+":
                            result = number1 + number2;
                            break;
                        case "-":
                            result = number1 - number2;
                            break;
                        case "*":
                            result = number1 * number2;
                            break;
                        case ":":
                            result = number1 / number2;
                            break;
                    }

                    txtResult.setText(result + "");
                }else {
                    Toast.makeText(MainActivity.this, "Ban phai nhap du so", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void AnhXa() {
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonCham = (Button) findViewById(R.id.buttonCham);
        buttonNhan = (Button) findViewById(R.id.buttonNhan);
        buttonChia = (Button) findViewById(R.id.buttonChia);
        buttonCong = (Button) findViewById(R.id.buttonCong);
        buttonTru = (Button) findViewById(R.id.buttonTru);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        buttonXoa = (Button) findViewById(R.id.buttonXoa);
        buttonXoaHet = (Button) findViewById(R.id.buttonXoaHet);
        buttonDoiDau = (Button) findViewById(R.id.buttonDoiDau);
        buttonPhanTram = (Button) findViewById(R.id.buttonPhanTram);
        ck1 = (CheckBox) findViewById(R.id.checkBox1);
        ck2 = (CheckBox) findViewById(R.id.checkBox2);
        txtNumber1 = (TextView) findViewById(R.id.txtSoThu1);
        txtNumber2 = (TextView) findViewById(R.id.txtSoThu2);
        txtOperator = (TextView) findViewById(R.id.txtPhepToan);
        txtResult = (TextView) findViewById(R.id.txtResult);
    }
}
