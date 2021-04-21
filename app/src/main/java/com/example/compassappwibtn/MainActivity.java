package com.example.compassappwibtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOpenCompass, btnOpenMap;
    Intent compassActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenCompass = findViewById(R.id.btnOpenCompassView);
        btnOpenMap = findViewById(R.id.btnMap);

        btnOpenCompass.setOnClickListener(this);
        btnOpenMap.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnOpenCompassView:
                compassActivity = new Intent(this, CompassActivity.class);
                startActivity(compassActivity);
                break;
            case R.id.btnMap:
                Intent intent = new Intent(this,MapsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}