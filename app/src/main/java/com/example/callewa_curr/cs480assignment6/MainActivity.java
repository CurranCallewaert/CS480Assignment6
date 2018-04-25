package com.example.callewa_curr.cs480assignment6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.KeyEvent;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;

public class MainActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
    }

    @Override
    public void run(){ //satisfy the runnable interface
    }
}

