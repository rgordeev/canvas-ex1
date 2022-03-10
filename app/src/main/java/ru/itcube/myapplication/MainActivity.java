package ru.itcube.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = new MainDraw(this);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("HELLO", "HELLO!");
//                v.animate().alpha(60).setDuration(1000)
//                        .rotationBy(180)
//                        .setDuration(2000).scaleX(0.5f).scaleY(0.5f)
//                        .setDuration(5000)
//                        .translationX(200);
//            }
//        });
        setContentView(view);
    }
}