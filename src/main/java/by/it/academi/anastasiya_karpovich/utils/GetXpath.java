package by.it.academi.anastasiya_karpovich.utils;

import by.it.academi.anastasiya_karpovich.entity.User;
import org.openqa.selenium.By;

public class GetXpath {
    public static By getXpath(){
        return By.xpath("//li/..//a[contains(text(),'WELCOME, "  + User.getFirstName() + "')]");
    }
}
