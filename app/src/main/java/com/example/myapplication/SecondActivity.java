package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/19.
 */

public class SecondActivity  extends AppCompatActivity{
Button btn;
    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout);
        btn = (Button) findViewById(R.id.btn2);
        t= (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        Bundle bun = intent.getExtras();
        String s = bun.getString("hello");
        t.setText(s);

    }

    public void hai(View source){
        Intent intent = new Intent();
        intent.putExtra("hai","hahahahaha");
        setResult(1,intent);
        finish();
    }

}
