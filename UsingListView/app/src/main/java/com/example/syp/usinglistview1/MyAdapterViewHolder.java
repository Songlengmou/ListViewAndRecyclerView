package com.example.syp.usinglistview1;

import android.widget.TextView;

/**
 * Created by syp on 17-5-23.
 */

public class MyAdapterViewHolder {
    private TextView tvName, tvDesc;

    public MyAdapterViewHolder(TextView tvName, TextView tvDesc) {
        this.tvName = tvName;
        this.tvDesc = tvDesc;
    }

    public TextView getTvName() {
        return tvName;
    }


    public TextView getTvDesc() {
        return tvDesc;
    }

}
