package suit;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 运行了！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 运行了！");
    }

    @Test
    public void ignore3(){
        System.out.println("ignore3 运行了！");
    }
}
