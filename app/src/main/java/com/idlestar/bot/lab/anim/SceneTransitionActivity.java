package com.idlestar.bot.lab.anim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import com.idlestar.bot.R;

public class SceneTransitionActivity extends AppCompatActivity {

    Scene mStartScene;
    Scene mEndScene;
    ViewGroup mSceneRoot;
    Transition mFadeTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_transition);

        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);

        mStartScene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, this);
        mEndScene =
                Scene.getSceneForLayout(mSceneRoot, R.layout.b_scene, this);

        mFadeTransition =
                TransitionInflater.from(this).
                        inflateTransition(R.transition.fade_transition);
    }

    public void changeScene(View view) {
        TransitionManager.go(mEndScene);

        Scene swap = mEndScene;
        mEndScene = mStartScene;
        mStartScene = swap;
    }
}
