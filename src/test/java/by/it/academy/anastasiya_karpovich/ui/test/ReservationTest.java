package by.it.academy.anastasiya_karpovich.ui.test;

import by.it.academi.anastasiya_karpovich.ui.step.ReservationStep;
import by.it.academi.anastasiya_karpovich.ui.utils.Date;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReservationTest extends BaseTest {
    @Test
    public void testReservationAuto() throws InterruptedException {
        try {
            Date date = new Date();
            ReservationStep reservationStep = new ReservationStep()
                    .goToReservationPage()

                    .fillReservationForm(date);

            Assert.assertTrue(reservationStep.isCheckoutSelectedPictUpLocationDisplayed(), "pick up location is not Boston");
            Assert.assertTrue(reservationStep.isCheckoutSelectedReturnLocationDisplayed(), "Return location is not Chicago");
            Assert.assertEquals(reservationStep.getCategoryOfCar(), reservationStep.setCategorySelectedFromReservationForm());
        } catch (NoSuchElementException e) {
            logger.info("Nothing car in this period");
        }
    }
}