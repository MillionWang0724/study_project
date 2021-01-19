package suit;

import org.testng.annotations.Test;

public class DepandTest {
    @Test
    public void test1(){
        System.out.println("test1 running");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 running");
    }
}
