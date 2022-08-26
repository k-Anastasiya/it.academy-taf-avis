package by.it.academi.anastasiya_karpovich.page;

import by.it.academi.anastasiya_karpovich.entity.User;
import by.it.academi.anastasiya_karpovich.utils.GetXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingUpPage extends HomePage {
    @FindBy(name = "firstname")
    private WebElement inputFirstName;
    @FindBy(name = "lastname")
    private WebElement inputLastName;
    @FindBy(id = "phone")
    private WebElement inputMobilePhone;
    @FindBy(id = "email")
    private WebElement inputEmailAddress;
    @FindBy(id = "PasswordHide")
    private WebElement inputPassword;
    @FindBy(id = "addressline1")
    private WebElement inputAddress;
    @FindBy(id = "zip")
    private WebElement inputZip;
    @FindBy(name = "city")
    private WebElement inputCity;
    @FindBy(id = "state")
    private WebElement inputState;
    @FindBy(id = "saveEnrollmentForm")
    private WebElement buttonSaveForm;
    @FindBy(xpath = "//span[contains(text(),'There are multiple')]")
    private WebElement errorMessageWhenEmptyCells;
    @FindBy(xpath = "//input[@name='firstname']/..//span")
    private WebElement errorMessageFirstName;
    @FindBy(xpath = "//input[@name='lastname']/..//span")
    private WebElement errorMessageLastName;
    @FindBy(xpath = "//input[@name='phone']/..//span")
    private WebElement errorMessagePhone;
    @FindBy(xpath = "//input[@id='email']/..//span[@class='platform-error-message error']")
    private WebElement errorMessageEmail;
    @FindBy(xpath = "//input[@id='PasswordHide']/..//span")
    private WebElement errorMessagePassword;
    @FindBy(xpath = "//input[@name='addressline1']/..//span")
    private WebElement errorMessageAddressLine;
    @FindBy(xpath = "//input[@id='zip']/..//span")
    private WebElement errorMessageZip;

    public SingUpPage typeFirstNameWithValidData() {
        inputFirstName.sendKeys(User.getFirstName());
        logger.info("firstName is: " + User.getFirstName());
        return this;
    }

    public SingUpPage typeFirstNameWithUnValidData() {
        inputFirstName.sendKeys("12312");
        return this;
    }

    public SingUpPage typeLastNameWithUnValidData() {
        inputLastName.sendKeys("@@@@@@");
        return this;
    }

    public SingUpPage typeLastNameWithValidData() {
        inputLastName.sendKeys(User.getLastName());
        logger.info("lastName is: " + User.getLastName());
        return this;
    }

    public SingUpPage typeMobilePhoneWithValidData() {
        inputMobilePhone.sendKeys(User.getMobileNumber());
        logger.info("mobile phone is: " + User.getMobileNumber());
        return this;
    }

    public SingUpPage typeMobilePhoneWithUnValidData() {
        inputMobilePhone.sendKeys("sfsfgdfg");
        return this;
    }

    public SingUpPage typeEmailAddressWithValidData() {
        inputEmailAddress.sendKeys(User.getEmailAddress());
        logger.info("emailAdress is: " + User.getEmailAddress());
        return this;
    }

    public SingUpPage typeEmailAddressWithUnValidData() {
        inputEmailAddress.sendKeys("hghghgjhgh");
        return this;
    }

    public SingUpPage typePasswordWithValidData() {
        inputPassword.sendKeys(User.getPassword());
        logger.info("password is: " + User.getPassword());
        return this;
    }

    public SingUpPage typeAddressWithValidData() {
        inputAddress.sendKeys(User.getAddressLine1());
        logger.info("address is: " + User.getAddressLine1());
        return this;
    }

    public SingUpPage typeZipWithValidData() {
        inputZip.sendKeys(User.getZip());
        logger.info("ZIP is: " + User.getZip());
        return this;
    }

    public SingUpPage typeCityWithValidData() {
        inputCity.sendKeys(User.getCity());
        logger.info("City is: " + User.getCity());
        return this;
    }

    public SingUpPage typeStateWithValidData() {
        inputState.sendKeys(User.getState());
        logger.info("state is: " + User.getFirstName());
        return this;
    }

    public SingUpPage clickButtonSaveForm() {
        buttonSaveForm.click();
        return new SingUpPage();
    }

    public boolean isNewUserDisplayed() {
        waitForVisibilityOfElement(driver.findElement(GetXpath.getXpath())).isDisplayed();
        return true;
    }

    public boolean isErrorMessageWhenEmptyCellsDisplayed() {
        return errorMessageWhenEmptyCells.isDisplayed();
    }

    public String getTextErrorMessageWhenFirstNameEmptyOrUncorrected() {
        return errorMessageFirstName.getText();
    }

    public String getErrorMessageWhenLastNameEmptyOrUncorrected() {
        return errorMessageLastName.getText();
    }

    public String getErrorMessageWhenPoneEmptyOrUncorrected() {
        return errorMessagePhone.getText();
    }

    public String getErrorMessageWhenEmailEmptyOrUncorrected() {
        return errorMessageEmail.getText();

    }
    public String getErrorMessageWhenPasswordEmptyOrUncorrected() {
        return errorMessagePassword.getText();
    }
    public String getErrorMessageWhenAddressLineEmptyOrUncorrected() {
        return errorMessageAddressLine.getText();
    }
    public String getErrorMessageWhenZipEmptyOrUncorrected() {
        return errorMessageZip.getText();
    }
}
