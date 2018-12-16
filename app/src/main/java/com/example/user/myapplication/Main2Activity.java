package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.user.myapplication.PlayerStorage.owin;
import static com.example.user.myapplication.PlayerStorage.xwin;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        PlayerStorage player = new PlayerStorage();
        xwin=player.getXwin();
        owin=player.getOwin();
        Button first = findViewById(R.id.firstButton);
        if((xwin!=0)|(owin!=0)){
            first.setText("Continue game");
        }
    }

    public void start(View view) {
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);

    }
}
