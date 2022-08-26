package by.it.academy.anastasiya_karpovich.ui.test;

import by.it.academi.anastasiya_karpovich.driver.DriverSingleton;
import org.junit.After;

public class BaseTest {
    @After
    public void finishTest() throws InterruptedException {
        DriverSingleton.closeDriver();
    }

}
