package com.example.apptoancau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnXacNhan;
    EditText editTextHoTen, editTextEmail, editTextSoDT;
    TextView txtThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoTen = editTextHoTen.getText().toString();
                String soDienThoai = editTextSoDT.getText().toString();
                String email = editTextEmail.getText().toString();
                String txtChaoBan = getResources().getString(R.string.txt_chaoban);
                String txtEmail = getResources().getString(R.string.txtEmail);
                String txtSoDt = getResources().getString(R.string.txt_SoDt);


                txtThongTin.setText( txtChaoBan + ": " + hoTen + "\n" +  txtSoDt + ": " + soDienThoai + "\n"
                + txtEmail + ": " + email);
            }
        });
    }

    private void AnhXa(){
        btnXacNhan = (Button) findViewById(R.id.buttonXacNhan);
        editTextEmail =(EditText) findViewById(R.id.editTextEmail);
        editTextHoTen = (EditText) findViewById(R.id.editTextHoTen);
        editTextSoDT = (EditText) findViewById(R.id.editTextSoDienThoai);
        txtThongTin = (TextView) findViewById(R.id.txtThongTin);
    }
}
