package suit.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTest {

    @Test(dataProvider = "names2")
    public void testDataProvide(String name, int age){
        System.out.println(name + "\t" + age);
    }

    @DataProvider(name = "names")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"wangzhihao", 1},
                {"xiaobei", 2}
        };
        return o;
    }

}
