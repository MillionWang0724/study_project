package suit;

import org.testng.annotations.Test;

public class TimeoutTest {
    @Test(timeOut = 300)
    public void sucess() throws InterruptedException {
        Thread.sleep(200);
    }

    @Test(timeOut = 200)
    public void failed() throws InterruptedException {
        Thread.sleep(300);
    }
}
