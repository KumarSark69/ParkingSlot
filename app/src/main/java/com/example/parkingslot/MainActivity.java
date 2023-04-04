package com.example.parkingslot;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    static  String[] gridViewValue = new String[40];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=findViewById(R.id.gridView);

        for(int i=1;i<=40;i++){
          gridViewValue[i-1]=i+"";
        }


        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.testing,gridViewValue);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                System.out.println(position);
                System.out.println(id);
                gridView.getChildAt(position).setBackgroundColor(Color.GRAY);
            }
        });
    }
}