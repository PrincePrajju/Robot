package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = (TextView)findViewById(R.id.textView4);
    }

    public void add1(View view) {
        count++;
        tv1.setText(String.valueOf(count));

    }

    public void add2(View view) {
    }

    public void sub1(View view) {
        count--;
        tv1.setText(String.valueOf(count));
    }

    public void sub2(View view) {
    }

    public void sub3(View view) {
    }

    public void sub4(View view) {
    }

    public void sub5(View view) {
    }

    public void sub6(View view) {
    }

    public void add3(View view) {
    }

    public void add4(View view) {
    }

    public void add5(View view) {
    }

    public void add6(View view) {
    }
}