package by.it.academy.anastasiya_karpovich.ui.test;

import by.it.academi.anastasiya_karpovich.page.HomePage;
import by.it.academi.anastasiya_karpovich.page.ReservationsPage;
import by.it.academi.anastasiya_karpovich.utils.Date;
import by.it.academy.anastasiya_karpovich.ui.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class ReservationTest extends BaseTest {
    @Test
    public void testReservationAuto() throws InterruptedException {
        Date date = new Date();
        new HomePage()
                .openPage()
                .clickLinkReservation()
                .clickLinkMakeReservation()
                .typePickUpLocation()
                .clickSelectPickUpLocation()
                .typeDateFrom(date)
                .typeReturnLocation()
                .clickReturnLocation()
                .typeToDate(date)
                .clickButtonSelectCar();
        ReservationsPage reservationsPage = new ReservationsPage();

         String categoryOfCar = reservationsPage.getCategoryOsSelectedCar();
              reservationsPage.clickLinkPayLater()
                .clickButtonProceedToCheckout();
              Thread.sleep(2000);

        Assert.assertTrue("pick up location is not Boston", reservationsPage.isCheckoutSelectedPictUpLocationDisplayed());
        Assert.assertTrue("Return location is not Chicago", reservationsPage.isCheckoutSelectedReturnLocationDisplayed());
        Assert.assertEquals(categoryOfCar,reservationsPage.getCategorySelectedFromReservationForm());
    }
}
