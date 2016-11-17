package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;


public class myService extends Service {

    class myBinder extends Binder{
        public void startCal(){
            Log.e("4","zhixing");
            Toast.makeText(myService.this,"hello",Toast.LENGTH_SHORT).show();
        }
    }

    myBinder myb = new myBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return myb;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("1","create");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("2","start");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        Log.e("3","destory");
        super.onDestroy();
    }
}
