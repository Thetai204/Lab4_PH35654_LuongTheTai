package com.example.lab4_ph35654_luongthetai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bai22 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai22);
        EditText gia = findViewById(R.id.edt_giasp);
        Intent intent = getIntent();
        String ten = intent.getStringExtra("name");
        TextView textView = findViewById(R.id.sanpham);
        textView.setText(ten);
        Button bnt = findViewById(R.id.btn_gia);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("Gia",gia.getText().toString());
                intent.putExtras(bundle);
                setResult(1,intent);
                finish();
            }
        });
    }

}
