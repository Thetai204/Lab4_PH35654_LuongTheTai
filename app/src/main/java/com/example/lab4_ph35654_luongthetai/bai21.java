package com.example.lab4_ph35654_luongthetai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class bai21 extends AppCompatActivity {
    ActivityResultLauncher getData = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode()==1){
                        Intent intent = result.getData();
                        TextView editText = findViewById(R.id.txt_gia);
                        if(intent!=null){
                            Bundle bundle = intent.getExtras();
                            String gia = bundle.getString("Gia");
                            editText.setText(gia);
                        }
                    }
                }
            }
    );
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai21);
        Button btn =findViewById(R.id.btn_gui);
        EditText edt =findViewById(R.id.edt_input);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai21.this,bai22.class);
                intent.putExtra("name",edt.getText().toString());
                getData.launch(intent);
            }
        });
    }
}
