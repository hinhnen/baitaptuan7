package com.example.dinh.baimot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtA, txtB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvent();
    }

    private void addEvent() {
    }

    private void addControls() {
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
    }

    public void xuLyPhepCong(View view) {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a + b;
        Toast.makeText(MainActivity.this,"Tổng Bằng C: "+c,Toast.LENGTH_LONG);
    }
}
