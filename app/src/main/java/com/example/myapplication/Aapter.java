package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/10/18.
 */

public class Aapter extends BaseAdapter {
    LinkedList<League> list;
    Context context;
    @Override
    public int getCount() {
        return list.size();
    }

    public Aapter(LinkedList<League> list,Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static  class Viewholder{
        ImageView img;
        TextView name;
        TextView says;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder ;
        if(convertView == null){
        convertView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        holder = new Viewholder();
            holder.img = (ImageView) convertView.findViewById(R.id.imgtou);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.says = (TextView) convertView.findViewById(R.id.says);

        convertView.setTag(holder);}else{
            holder = (Viewholder)convertView.getTag();
        }

        holder.img.setBackgroundResource(list.get(position).getId());
        holder.name.setText(list.get(position).getName());
        holder. says.setText(list.get(position).getSays());
        return convertView;
    }
}
