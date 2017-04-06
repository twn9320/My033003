package com.example.yvtc.my033003;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

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
        ViewHolder holder = new ViewHolder();
        if(convertView == null){
            convertView=((Activity)context).getLayoutInflater().inflate(R.layout.myitem,null);
            holder.tv=(TextView)convertView.findViewById(R.id.textView);
            holder.chk=(CheckBox)convertView.findViewById(R.id.checkBox);
            holder.btn=(Button)convertView.findViewById(R.id.button);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder)convertView.getTag();
        }
        holder.chk.setOnCheckedChangeListener(null);//解決打勾消失問題(很難)
        holder.chk.setChecked(chks[position]);
        holder.chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                chks[position] = isChecked;
            }
        });
        holder.tv.setText(data.get(position));
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,data.get(position),Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
    static class ViewHolder{
        TextView tv;
        CheckBox chk;
        Button btn;
    }
}
