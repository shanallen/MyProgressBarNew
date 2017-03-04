package com.example.shanjigang.myprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by shanjigang on 2017/2/26.
 */

public class TestGithubActivity extends Activity {
    //
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(view);
        boolean b = true;
        add(1, "", b);
    }

    private void add(int i, String s, boolean b) {
        s = s + "13";
        i++;
        b = b;
    }

    private void initView(View view) {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
