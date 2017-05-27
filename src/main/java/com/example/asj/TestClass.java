package com.example.asj;

/**
 * Created by congge on 2017/5/19.
 */

@DebugLog
public class TestClass {
    public TestClass(){
        spendTimeNms4(4);
    }

    public void spendTimeNms(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void spendTimeNms2(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void spendTimeNms3(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void spendTimeNms4(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
