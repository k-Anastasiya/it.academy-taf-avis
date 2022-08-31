package by.it.academi.anastasiya_karpovich.ui.page;

import by.it.academi.anastasiya_karpovich.ui.utils.Date;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ReservationsPage extends HomePage {

    private String categoryOfCar;
    @FindBy(xpath = "//div[@class='col-lg-12 res-inputFldFst']//*[@id='PicLoc_value']")
    private WebElement inputPickUpLocation;
    @FindBy(xpath = "//div[@class='angucomplete-row']/..//span[contains(text(),'Boston')]")
    private WebElement selectPickUpLocation;
    @FindBy(id = "from")
    private WebElement inputFromDate;
    @FindBy(xpath = "//div[@class='col-xs-6 res-inputFld ']//input[@id='DropLoc_value']")
    private WebElement inputReturnLocation;
    @FindBy(xpath = "//div[@class='angucomplete-description']/..//span[contains(text(),'Chicago')]")
    private WebElement selectReturnLocation;
    @FindBy(id = "to")
    private WebElement selectToDate;
    @FindBy(id = "res-home-select-car")
    private WebElement buttonSelectCar;
    @FindBy(xpath = "//div[@class='row avilablecar available-car-box']//h3[@ng-bind='car.carGroup']/following::a[text()='Pay Later']")
    private WebElement linkPayLater;
    @FindBy(xpath = "//button[text()='Proceed to Checkout']")
    private WebElement buttonProceedToCheckout;
    @FindBy(xpath = "//div[@class='location-info' and contains(text(),'Boston')]")
    private WebElement checkoutSelectedPictUpLocation;
    @FindBy(xpath = "//div[@class='location-info' and contains(text(),'Chicago')]")
    private WebElement checkoutSelectedReturnLocation;
    @FindBy(xpath = "//*[@id=\"vehicleTeaser\"]/div[2]/div[1]/div[1]/div/section/div/div[2]/div[1]/div/div[3]/div[4]/div[1]")
    private WebElement checkoutSelectedCategoryCar;
    @FindBy(xpath = "//div[@class='row avilablecar available-car-box']//h3[@ng-bind='car.carGroup' ]")
    private WebElement categoryOfSelectedCar;


    public ReservationsPage typePickUpLocation() {
        inputPickUpLocation.sendKeys("Boston");
        return this;
    }

    public ReservationsPage clickSelectPickUpLocation() {
        selectPickUpLocation.click();
        return this;
    }

    public ReservationsPage typeDateFrom(Date date) {
        inputFromDate.clear();
        inputFromDate.sendKeys(date.getDateFrom());
        return this;
    }

    public ReservationsPage typeReturnLocation() {
        inputReturnLocation.sendKeys("Chicago");
        return this;
    }

    public ReservationsPage clickReturnLocation() {
        selectReturnLocation.click();
        return this;
    }

    public ReservationsPage typeToDate(Date date) {
        selectToDate.clear();
        selectToDate.sendKeys(date.getDateTo());
        return this;
    }

    public ReservationsPage clickButtonSelectCar() {
        buttonSelectCar.click();
        return this;
    }

    public ReservationsPage clickLinkPayLater() {
        linkPayLater.click();
        return this;
    }

    public ReservationsPage clickButtonProceedToCheckout() {
        buttonProceedToCheckout.click();
        return this;
    }

    public boolean isCheckoutSelectedPictUpLocationDisplayed() {
        return waitForVisibilityOfElement(checkoutSelectedPictUpLocation).isDisplayed();
    }

    public boolean isCheckoutSelectedReturnLocationDisplayed() {
        return waitForVisibilityOfElement(checkoutSelectedReturnLocation).isDisplayed();
    }

    public String setCategorySelectedFromReservationForm() {
        checkoutSelectedCategoryCar.getText();
        return categoryOfCar;
    }

    public String getCategoryOsSelectedCar() {
        return categoryOfSelectedCar.getText();
    }

    public String getCategoryOfCar() {
        return categoryOfCar;
    }
}