package suit.multhread;

import org.testng.annotations.Test;

public class MulThreadOnXml {
    @Test
    public void test1(){
        System.out.println(1);
        System.out.println("Thread id: "+ Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println(1);
        System.out.println("Thread id: "+ Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println(1);
        System.out.println("Thread id: "+ Thread.currentThread().getId());
    }
}
