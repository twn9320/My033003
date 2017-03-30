package com.example.yvtc.my033003;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by YVTC on 2017/3/30.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    String data[];
    String data2[];
    public MyAdapter(Context c,String[] d,String[] d2){
        context =c;
        data = d;
        data2 =d2;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = ((Activity)context).getLayoutInflater().inflate(R.layout.myitem,null);
        TextView tv = (TextView)v.findViewById(R.id.textView);
        TextView tv2 =(TextView)v.findViewById(R.id.textView2);
        tv.setText(data[position]);
        tv2.setText(data2[position]);
        return v;
    }
}
