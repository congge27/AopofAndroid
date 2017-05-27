package com.example.asj;

/**
 * Created by congge on 2017/5/19.
 */
public class TestMethodClass {
    public TestMethodClass(){
        new Thread(){
            @Override
            @DebugLog
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @DebugLog
    public void spendTime1ms(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DebugLog
    public static void spendTime2ms(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DebugLog
    public final void spendTime3ms(){
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
