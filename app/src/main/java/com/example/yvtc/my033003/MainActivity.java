package com.example.yvtc.my033003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String data[]={"蘋果","檸檬","香蕉","橘子"};
    String data2[]={"Apple","Lemon","Banana","Orange"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(MainActivity.this,data,data2);
        lv.setAdapter(adapter);
    }

}
