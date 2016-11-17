package com.example.myapplication;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/21.
 */

public class ActivityController {
    public static List<Activity> lists = new ArrayList<>();
    public static void addActivity(Activity a){
        lists.add(a);
    }

    public static void removeActivity(Activity a){
        lists.remove(a);
    }

    public void finish(){
        for (Activity a:lists){
            if(!a.isFinishing()){
                a.finish();
            }
        }
    }
}
