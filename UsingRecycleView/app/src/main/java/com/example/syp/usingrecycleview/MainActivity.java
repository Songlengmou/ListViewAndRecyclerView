package com.example.syp.usingrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private RVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);

        adapter = new RVAdapter(this);

        //①线性
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);//滑动方向
        //②瀑布流
        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);
        //③网格
        GridLayoutManager glm = new GridLayoutManager(this, 3);
        glm.setOrientation(GridLayoutManager.VERTICAL);

        rv.setLayoutManager(llm);

        rv.setAdapter(adapter);

    }
}
