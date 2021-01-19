package suit.packages;

import org.testng.annotations.Test;

@Test(groups = "stu1")
public class GroupOnClass1 {

    public void stu1(){
        System.out.println("GroupOnClass1中的stu1运行了");
    }

    public void stu2(){
        System.out.println("GroupOnClass1中的stu2运行了");
    }
}
