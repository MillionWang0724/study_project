package suit.packages;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "service")
    public void test1(){
        System.out.println("服务端组测试方法1");
    }


    @Test(groups = "service")
    public void test2(){
        System.out.println("服务端测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端组测试方法3");
    }


    @Test(groups = "client")
    public void test4(){
        System.out.println("客户段测试方法4");
    }

    @BeforeGroups("service")
    public void beforeServiceGroup(){
        System.out.println("服务端组之前！");
    }

    @AfterGroups("service")
    public void afterServiceGroups(){
        System.out.println("服务端组之后");
    }

}
