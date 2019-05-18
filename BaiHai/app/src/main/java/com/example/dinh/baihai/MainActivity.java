package com.example.dinh.baihai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    EditText txtA, txtB;
    // Đối với kiểu Anomous Listener thì phải khai báo Button
    Button btnTru;
    //
    Button btnNhan,btnChia;

    Button btnAn;

    View.OnClickListener suKienChiaSe = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control();
        event();
    }

    private void event() {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyPhepTru();
            }
        });
        suKienChiaSe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btnNhan){
                    xuLyPhepNhan();
                }
                else {
                    xuLyPhepChia();
                }
            }
        };
        btnNhan.setOnClickListener(suKienChiaSe);
        btnChia.setOnClickListener(suKienChiaSe);
        btnAn.setOnLongClickListener(this);
    }

    private void xuLyPhepChia() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a / b;
        Toast.makeText(MainActivity.this,"Thương 2 số là: "+c,Toast.LENGTH_SHORT).show();
    }

    private void xuLyPhepNhan() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a * b;
        Toast.makeText(MainActivity.this,"Tích 2 số là: "+c,Toast.LENGTH_SHORT).show();
    }

    private void xuLyPhepTru() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a - b;
        Toast.makeText(MainActivity.this,"Hiệu 2 số là: "+c,Toast.LENGTH_SHORT).show();
    }

    private void control() {
        //Khai báo biến tham chiếu địa chỉ
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnAn = findViewById(R.id.btnAn);
    }

    public void xuLyPhepCong(View view) {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a + b;
        Toast.makeText(MainActivity.this,"Tồng 2 số là: "+c,Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId() == R.id.btnAn){
            btnAn.setVisibility(View.INVISIBLE);
        }
        return false;
    }
}
