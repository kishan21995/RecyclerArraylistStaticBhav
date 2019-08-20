package com.e.recyclerarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModelClass> modelClassList = new ArrayList();

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);


        for (int i = 0; i <= 100; i++) {
            ModelClass modelClass = new ModelClass();
            modelClass.setName("Tarun" + i);
            modelClass.setAddress("Kiratpur" + i);
         //   modelClass.setImage("https://www.google.com/search?q=sample+image+url&tbm=isch&source=iu&ictx=1&fir=8LQNl8WRYYNYMM%253A%252C8UmY9BIZlcHvZM%252C_&vet=1&usg=AI4_-kS5m9gS_qXTjD82Z9aLOFDpzLs6bA&sa=X&ved=2ahUKEwjGxoalrcPjAhWD8HMBHVC3DcIQ9QEwAHoECAYQBA#C:\\Users\\mycomputer\\Desktop\\image - Google Search_iles");
            modelClass.setEmail("rajputtarun89799@gmail.com" + i);
            modelClassList.add(modelClass);
        }

        adapter = new Adapter(modelClassList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
}
