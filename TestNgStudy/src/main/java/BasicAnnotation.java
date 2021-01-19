import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是一个测试用例1");
    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("在测试方法之前执行");
        System.out.println("=================");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("在测试方法之后运行");
        System.out.println("=================");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类之前运行");
    }

    @AfterMethod
    public void afterClass(){
        System.out.println("类之后运行");
    }

    @BeforeSuite
    public void beforSuit(){
        System.out.println("套件之前");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("套件之后");
    }
}
