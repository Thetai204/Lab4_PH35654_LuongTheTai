package com.example.lab4_ph35654_luongthetai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class bai11 extends AppCompatActivity {
 private String TAG = "Status";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai11);
        Button btn = findViewById(R.id.btn_activity1);
        Log.i(TAG,"onStast");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai11.this , bai12.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStats");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onStats");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onStats");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStats");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onStats");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onStats");
    }
}