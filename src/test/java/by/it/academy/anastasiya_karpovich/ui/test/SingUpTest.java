package by.it.academy.anastasiya_karpovich.ui.test;

import by.it.academi.anastasiya_karpovich.ui.entity.ErrorMessage;
import by.it.academi.anastasiya_karpovich.ui.entity.User;
import by.it.academi.anastasiya_karpovich.ui.page.SingUpPage;
import by.it.academi.anastasiya_karpovich.ui.step.SingUpStep;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUpTest extends BaseTest {

    @Test
    public void testSinginFormWithCorrectCredentials() throws InterruptedException {
        try {
            User user = new User();
            new SingUpStep()
                    .goToLogInPage()

                    .fillFormOfLoginIn()
                    .clickButtonSaveForm();
            SingUpPage loginPage = new SingUpPage();

            Assert.assertTrue(loginPage.isNewUserDisplayed(), "New user not created");
        } catch (NoSuchElementException e) {
            logger.info("New user not created");
        }
    }

    @Test
    public void testSinginWithEmptyCredentials() {
      new SingUpStep()
              .goToLogInPage()

                .clickButtonSaveForm();
        SingUpPage singUpPage = new SingUpPage();

        Assert.assertTrue(singUpPage.isErrorMessageWhenEmptyCellsDisplayed(), "The error message not displayed");
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyFirstNaneInput, singUpPage.getTextErrorMessageWhenFirstNameEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyLastName, singUpPage.getErrorMessageWhenLastNameEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyPhoneNumber, singUpPage.getErrorMessageWhenPoneEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyEmailAddress, singUpPage.getErrorMessageWhenEmailEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyPassword, singUpPage.getErrorMessageWhenPasswordEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyZip, singUpPage.getErrorMessageWhenZipEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmptyAddressLine, singUpPage.getErrorMessageWhenAddressLineEmptyOrUncorrected());
    }

    @Test
    public void  testSinginWithIncorrectCredentials() {
        User user = new User();
        new SingUpStep()
                .goToLogInPage()

                .fillFormOfSingUpUnvalidData();
        SingUpPage singUpPage = new SingUpPage();
        Assert.assertEquals(ErrorMessage.errorMessageWhenFirstNameFillUncorrectedData, singUpPage.getTextErrorMessageWhenFirstNameEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenLastNameFillUncorrectedData, singUpPage.getErrorMessageWhenLastNameEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenPoneFilledUncorrectedDate, singUpPage.getErrorMessageWhenPoneEmptyOrUncorrected());
        Assert.assertEquals(ErrorMessage.errorMessageWhenEmailFilledUncorrectedDate, singUpPage.getErrorMessageWhenEmailEmptyOrUncorrected());
    }
}
