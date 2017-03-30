package com.example.yvtc.my033003;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by YVTC on 2017/3/30.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> data;
    public boolean chks[];
    public MyAdapter(Context c,ArrayList<String> d){
        context =c;
        data = d;
        chks = new boolean[d.size()];
    }
    @Override
    public int getCount() {
        return data.size();
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        Log.d("MyView","P:"+position);
        View v = ((Activity)context).getLayoutInflater().inflate(R.layout.myitem,null);
        TextView tv = (TextView)v.findViewById(R.id.textView);
        CheckBox chk = (CheckBox)v.findViewById(R.id.checkBox);
        chk.setChecked(chks[position]);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                chks[position] = isChecked;
            }
        });
        tv.setText(data.get(position));
        return v;
    }
}
