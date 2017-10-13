package com.ou.bonusscreen;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<WineModel> wineList;
    WineListAdapter wineListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.wine_list);

        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.action_bar);


        wineList=new ArrayList<>();

        wineList.add(new WineModel("RIESLING","White wine",2005,"The classic German grape of the Rhine and Mosel",2.59f,26.19f,true,R.drawable.wine1));
        wineList.add(new WineModel("RIESLING","Red wine",2015,"The classic German grape of the Rhine and Mosel",2.19f,22.99f,true,R.drawable.wine2));
        wineList.add(new WineModel("RIESLING","White wine",2010,"The classic German grape of the Rhine and Mosel",1.99f,20.49f,false,R.drawable.wine3));
        wineList.add(new WineModel("RIESLING","Red wine",2008,"The classic German grape of the Rhine and Mosel",2.39f,24.79f,true,R.drawable.wine4));
        wineList.add(new WineModel("RIESLING","White wine",2003,"The classic German grape of the Rhine and Mosel",2.99f,30.99f,true,R.drawable.wine5));
        wineList.add(new WineModel("RIESLING","White wine",2005,"The classic German grape of the Rhine and Mosel",2.59f,26.19f,false,R.drawable.wine1));
        wineList.add(new WineModel("RIESLING","Red wine",2015,"The classic German grape of the Rhine and Mosel",2.19f,22.99f,true,R.drawable.wine2));
        wineList.add(new WineModel("RIESLING","White wine",2010,"The classic German grape of the Rhine and Mosel",1.99f,20.49f,true,R.drawable.wine3));
        wineList.add(new WineModel("RIESLING","Red wine",2008,"The classic German grape of the Rhine and Mosel",2.39f,24.79f,true,R.drawable.wine4));
        wineList.add(new WineModel("RIESLING","White wine",2003,"The classic German grape of the Rhine and Mosel",2.99f,30.99f,true,R.drawable.wine5));

        wineListAdapter= new WineListAdapter(this, wineList);
        recyclerView.setAdapter(wineListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
