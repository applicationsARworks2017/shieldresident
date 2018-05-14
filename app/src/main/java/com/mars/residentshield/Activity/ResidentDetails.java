package com.mars.residentshield.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mars.residentshield.R;

public class ResidentDetails extends AppCompatActivity {
    Button resister_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident_details);
        resister_bt=(Button)findViewById(R.id.resister_bt);
        resister_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResidentDetails.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
