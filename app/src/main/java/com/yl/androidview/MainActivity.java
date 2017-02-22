package com.yl.androidview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Dog> mDogList = new ArrayList<Dog>();
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initViews();

    }

    private void initViews() {
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        //LinearLayoutManager manger = new LinearLayoutManager(this);
       // manger.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager manger = new GridLayoutManager(this,3);

        StaggeredGridLayoutManager manger = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manger);
        mAdapter = new MyAdapter(mDogList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initDogList() {
        mDogList.add(new Dog("dog155566666666666666666",R.drawable.dog1));
        mDogList.add(new Dog("dog2",R.drawable.dog2));
        mDogList.add(new Dog("dog3444444444444",R.drawable.dog3));
        mDogList.add(new Dog("dog4",R.drawable.dog4));
        mDogList.add(new Dog("dog5",R.drawable.dog5));
        mDogList.add(new Dog("dog6",R.drawable.dog6));
        mDogList.add(new Dog("dog7",R.drawable.dog7));
        mDogList.add(new Dog("dog8",R.drawable.dog8));
        mDogList.add(new Dog("dog9",R.drawable.dog9));
        mDogList.add(new Dog("dog0",R.drawable.dog10));

    }
}
