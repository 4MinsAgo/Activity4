package com.example.faeserrano.Activity4;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nameView= (TextView) findViewById(R.id.result_txt);
        nameView.setText(getIntent().getExtras().getString("userName"));

    }
}
