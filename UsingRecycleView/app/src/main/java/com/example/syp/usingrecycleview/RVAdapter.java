package com.example.syp.usingrecycleview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syp on 17-5-23.
 */

public class RVAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<User> users = new ArrayList<>();

    public RVAdapter(Context context) {
        this.context = context;

        add();
    }


    @Override
    public RVAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new RVAdapterViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.rv_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RVAdapterViewHolder rvHolder = (RVAdapterViewHolder) holder;

        User user = users.get(position);
        rvHolder.getTvName().setText("姓名：" + user.getName());
        rvHolder.getTvDesc().setText("年龄：" + user.getAge() + ",性别：" + user.getGendar());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public Context getContext() {
        return context;
    }

    private void add() {
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
        users.add(new User("小明", 23, "男"));
    }
}
