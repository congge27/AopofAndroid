package com.example.asj;

import android.util.Log;

/**
 * Created by congge on 2017/5/19.
 */

public class TestLog {
    @DebugLog
    public void doSomeThing(){
        Log.d("testlog","this is testlog");
    }
}
