package by.it.academi.anastasiya_karpovich.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (xpath = "//*[@id='nav-groupMenu']/ul[2]/ul/..//a[text()='Sign Up']")
    private WebElement linkSignUp;
    @FindBy(xpath = "//*[@id='nav-offcanvas']/li[1]/a")
    private WebElement linkReservation;
    @FindBy(xpath = "//*[@id='nav-offcanvas']/li[1]/ul/li[2]/a[text()='Make a Reservation']")
    private WebElement linkMakeAreservation;


    public HomePage openPage() {
        driver.get(BASE_URL);
        return this;
    }
    public SingUpPage clickLinkSignUp(){
        linkSignUp.click();
        return new SingUpPage();
    }
    public HomePage clickLinkReservation(){
        linkReservation.click();
        return this;
    }
    public ReservationsPage clickLinkMakeReservation(){
        linkMakeAreservation.click();
        return new ReservationsPage();
    }
}
