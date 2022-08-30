package by.it.academi.anastasiya_karpovich.ui.step;

import by.it.academi.anastasiya_karpovich.ui.page.HomePage;
import by.it.academi.anastasiya_karpovich.ui.page.SingUpPage;

public class SingUpStep extends SingUpPage {
public SingUpStep goToLogInPage(){
    new HomePage()
            .openPage()
            .clickLinkSignUp();
    return this;
}
public SingUpStep fillFormOfLoginIn(){
     new SingUpPage()
             .typeFirstNameWithValidData()
            .typeLastNameWithValidData()
            .typeMobilePhoneWithValidData()
            .typeEmailAddressWithValidData()
            .typePasswordWithValidData()
            .typeAddressWithValidData()
            .typeZipWithValidData()
            .typeCityWithValidData()
            .typeStateWithValidData();
             return this;
}
public SingUpStep fillFormOfSingUpUnvalidData(){
    new SingUpPage()
            .typeFirstNameWithUnValidData()
            .typeLastNameWithUnValidData()
            .typeMobilePhoneWithUnValidData()
            .typeEmailAddressWithUnValidData()
            .typePasswordWithValidData()
            .typeAddressWithValidData()
            .typeZipWithValidData()
            .typeCityWithValidData()
            .typeStateWithValidData();
    return this;
}
}
