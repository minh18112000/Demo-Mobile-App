package com.example.cuocduakithu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtScore;
    SeekBar sk1, sk2, sk3;
    CheckBox ck1, ck2, ck3;
    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        seekBarEnbale();
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ck1.isChecked()) {
                    ck2.setChecked(false);
                    ck3.setChecked(false);
                }
            }
        });
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ck2.isChecked()){
                    ck1.setChecked(false);
                    ck3.setChecked(false);
                }
            }
        });
        ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ck3.isChecked()) {
                    ck1.setChecked(false);
                    ck2.setChecked(false);
                }
            }
        });

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked() || ck2.isChecked() || ck3.isChecked()) {
                    checkUnEnable();
                    imgButton.setVisibility(View.INVISIBLE);
                    final CountDownTimer countDownTimer = new CountDownTimer(80000, 500) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            Random random = new Random();
                            int ran1 = random.nextInt(5);
                            int ran2 = random.nextInt(5);
                            int ran3 = random.nextInt(5);
                            if (sk1.getProgress() < sk1.getMax()) {
                                sk1.setProgress(sk1.getProgress() + ran1);
                            } else {
                                this.cancel();
                                if(ck1.isChecked()){
                                    txtScore.setText((Integer.parseInt(txtScore.getText().toString()) + 10) + "");
                                    Toast.makeText(MainActivity.this, "Ban da dat cuoc dung", Toast.LENGTH_SHORT).show();

                                } else {
                                    txtScore.setText((Integer.parseInt(txtScore.getText().toString()) - 10) + "");
                                    Toast.makeText(MainActivity.this, "Ban da dat cuoc sai", Toast.LENGTH_SHORT).show();
                                }
                                refresh();
                                boCheck();
                                checkEnable();
                                imgButton.setVisibility(View.VISIBLE);
                            }
                            if (sk2.getProgress() < sk2.getMax()) {
                                sk2.setProgress(sk2.getProgress() + ran2);
                            } else {
                                this.cancel();
                                if(ck2.isChecked()){
                                    txtScore.setText((Integer.parseInt(txtScore.getText().toString()) + 10) + "");
                                    Toast.makeText(MainActivity.this, "Ban da dat cuoc dung", Toast.LENGTH_SHORT).show();
                                } else {
                                    txtScore.setText((Integer.parseInt(txtScore.getText().toString()) - 10) + "");
                                    Toast.makeText(MainActivity.this, "Ban da dat cuoc sai", Toast.LENGTH_SHORT).show();
                                }
                                refresh();
                                boCheck();
                                checkEnable();
                                imgButton.setVisibility(View.VISIBLE);
                            }
                            if (sk3.getProgress() < sk2.getMax()) {
                                sk3.setProgress(sk3.getProgress() + ran3);
                            } else {
                                this.cancel();
                                if(ck3.isChecked()){
                                    txtScore.setText((Integer.parseInt(txtScore.getText().toString()) + 10) + "");
                                    Toast.makeText(MainActivity.this, "Ban da dat cuoc dung", Toast.LENGTH_SHORT).show();
                                } else {
                                    txtScore.setText((Integer.parseInt(txtScore.getText().toString()) - 10) + "");
                                    Toast.makeText(MainActivity.this, "Ban da dat cuoc sai", Toast.LENGTH_SHORT).show();
                                }
                                refresh();
                                boCheck();
                                checkEnable();
                                imgButton.setVisibility(View.VISIBLE);
                            }
                        }

                        @Override
                        public void onFinish() {

                        }
                    };
                    countDownTimer.start();
                } else {
                    Toast.makeText(MainActivity.this, "Ban phai dat cuoc truoc khi choi", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void AnhXa() {
        txtScore = (TextView) findViewById(R.id.txtScore);
        imgButton = (ImageButton) findViewById(R.id.imageButton);
        sk1 = (SeekBar) findViewById(R.id.seekBar1);
        sk2 = (SeekBar) findViewById(R.id.seekBar2);
        sk3 = (SeekBar) findViewById(R.id.seekBar3);
        ck1 = (CheckBox) findViewById(R.id.checkBox1);
        ck2 = (CheckBox) findViewById(R.id.checkBox2);
        ck3 = (CheckBox) findViewById(R.id.checkBox3);
    }

    private void refresh(){
        sk1.setProgress(0);
        sk2.setProgress(0);
        sk3.setProgress(0);
    }

    private void boCheck(){
        ck1.setChecked(false);
        ck2.setChecked(false);
        ck3.setChecked(false);
    }

    private void checkUnEnable(){
        ck1.setEnabled(false);
        ck2.setEnabled(false);
        ck3.setEnabled(false);
    }

    private void checkEnable(){
        ck1.setEnabled(true);
        ck2.setEnabled(true);
        ck3.setEnabled(true);
    }

    private void seekBarEnbale(){
        sk1.setEnabled(false);
        sk2.setEnabled(false);
        sk3.setEnabled(false);
    }
}
