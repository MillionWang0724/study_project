package suit.multhread;

import org.testng.annotations.Test;

public class MulThreadOnAnnotion {
    @Test(invocationCount = 10, threadPoolSize = 10)
    public void test(){
        System.out.println(1);
        System.out.println("Thread id: "+ Thread.currentThread().getId());
    }
}
