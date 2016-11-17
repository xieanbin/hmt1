package com.example.myapplication;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements Wfrag.WfragListener {
    LinkedList<League> list;
    Aapter adapter;
    ListView listview;
    ImageView img;
    EditText etext;
    Button btn;
    TextView text;
    ProgressBar pro;
    myService.myBinder myb;
    //calThread cal;
    int[] imgs = {R.drawable.annie,
            R.drawable.meinv,R.drawable.panda,R.drawable.shuaige,
    };
    int m=0;
    Message msg;

    Wfrag f2;
    Wfrag wfrag;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.main_activity);

         f2 = Wfrag.newInstance("hello","haha");
        getFragmentManager().beginTransaction().add(R.id.line1,f2,"tagf2").commit();

       // btn= (Button)findViewById(R.id.show1);
         btn = (Button)findViewById(R.id.loadname);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       Bfrag bfrag = (Bfrag) getFragmentManager().findFragmentById(R.id.f1);
         wfrag = (Wfrag) getFragmentManager().findFragmentByTag("tagf2");
       bfrag.showname("you are right");
        wfrag.showname("you are handsome");
      Bundle bun = new Bundle();
        bun.putString("1","Bfrag");
        bfrag.setBundle(bun);
        wfrag.setBundle(bun);
        bfrag.showthis();
    }
});
    }

public void shownames(){
    Log.e("3","zheshi");
}


Button btn2;
    @Override
    protected void onResume() {
        super.onResume();
        btn2 = (Button) findViewById(R.id.showage);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void onInteraction(String s) {
       Log.e("2",s);
    }
}
