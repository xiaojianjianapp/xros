package com.xros.framework.bus.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xros.framework.bus.R;

/**
 * Created by xiaojianjianapp@gmail.comon 2017/10/29.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}
