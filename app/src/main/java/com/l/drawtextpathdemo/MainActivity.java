package com.l.drawtextpathdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import yanzhikai.textpath.SyncTextPathView;
import yanzhikai.textpath.painter.FireworksPainter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SyncTextPathView tpv1 = findViewById(R.id.tpv1);
        SyncTextPathView tpv2 = findViewById(R.id.tpv2);
        tpv1.setText("大吉大利");
        tpv1.setDuration(10000);
        tpv1.setPathPainter(new FireworksPainter());
        tpv1.startAnimation(0, 1);

        tpv2.setText("今晚吃鸡");
        tpv2.setDuration(10000);
        tpv2.setPathPainter(new FireworksPainter());
        tpv2.startAnimation(0, 1);

        findViewById(R.id.like_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((LikeLayoutView) v).addHeart();
            }
        });
    }
}
