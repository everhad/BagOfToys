package com.idlestar.bot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.idlestar.bot.lab.anim.SceneTransitionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSceneTransitionActivity(View view) {
        Intent intent = new Intent(this, SceneTransitionActivity.class);
        startActivity(intent);
    }
}
