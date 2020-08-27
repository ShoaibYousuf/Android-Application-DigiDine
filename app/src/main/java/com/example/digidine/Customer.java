package com.example.digidine;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Customer extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        RecyclerView recycle123 =(RecyclerView)findViewById(R.id.recycler_123);
        recycle123.setLayoutManager(new LinearLayoutManager(this));
        String[] contacts= {"KFC","McDONALDS","OPTP","Ranchers","Chae Khana","Four Seasons","Roaster","Khiwa","Red Onion","Hotspot","Ginyaki"};
        recycle123.setAdapter(new Adaptor1(contacts));
    }
}
