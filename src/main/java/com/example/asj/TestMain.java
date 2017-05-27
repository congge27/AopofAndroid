package com.example.asj;

/**
 * Created by congge on 2017/5/19.
 */
public class TestMain {
    public static void TestAll(){
        //注解在类上,每个方法都打印成功
        TestClass testClass = new TestClass();
        testClass.spendTimeNms(1);
        testClass.spendTimeNms2(2);
        testClass.spendTimeNms3(3);

        //注解在方法上,static方法也可以成功
        TestMethodClass testMethodClass = new TestMethodClass();
        testMethodClass.spendTime1ms();
        TestMethodClass.spendTime2ms();
        testMethodClass.spendTime3ms();

        TestLog testLog = new TestLog();
        testLog.doSomeThing();
    }
}