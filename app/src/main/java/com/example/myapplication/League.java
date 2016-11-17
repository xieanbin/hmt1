package com.example.myapplication;

/**
 * Created by Administrator on 2016/10/18.
 */

public class League {
    String name;
    String says;
    int id;

    public League(int id, String name, String says) {
        this.id = id;
        this.name = name;
        this.says = says;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
