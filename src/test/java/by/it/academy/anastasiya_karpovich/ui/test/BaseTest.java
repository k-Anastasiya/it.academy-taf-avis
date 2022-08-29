package by.it.academy.anastasiya_karpovich.ui.test;

import by.it.academi.anastasiya_karpovich.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;

public class BaseTest {
    protected static final Logger logger = LogManager.getLogger();

    @After
    public void finishTest() throws InterruptedException {
        DriverSingleton.closeDriver();
    }

}
