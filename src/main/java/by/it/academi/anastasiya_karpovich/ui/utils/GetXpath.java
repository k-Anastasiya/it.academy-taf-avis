package by.it.academi.anastasiya_karpovich.ui.utils;

import by.it.academi.anastasiya_karpovich.ui.entity.User;
import org.openqa.selenium.By;

public class GetXpath {
    public static By getXpath(){
        return By.xpath("//li/..//a[contains(text(),'WELCOME, "  + User.getFirstName() + "')]");
    }
}
