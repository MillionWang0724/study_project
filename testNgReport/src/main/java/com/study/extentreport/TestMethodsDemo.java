package com.study.extentreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void logDemo(){
        Reporter.log("自己写的日志");
        throw new RuntimeException("自己运行时的异常");
    }

}
