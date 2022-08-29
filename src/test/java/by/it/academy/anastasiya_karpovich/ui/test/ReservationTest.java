package by.it.academy.anastasiya_karpovich.ui.test;

import by.it.academi.anastasiya_karpovich.step.ReservationStep;
import by.it.academi.anastasiya_karpovich.utils.Date;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class ReservationTest extends BaseTest {
    @Test
    public void testReservationAuto() throws InterruptedException {
        try {
            Date date = new Date();
            ReservationStep reservationStep = new ReservationStep()
                    .goToReservationPage()

                    .fillReservationForm(date);

            Assert.assertTrue("pick up location is not Boston", reservationStep.isCheckoutSelectedPictUpLocationDisplayed());
            Assert.assertTrue("Return location is not Chicago", reservationStep.isCheckoutSelectedReturnLocationDisplayed());
            Assert.assertEquals(reservationStep.getCategoryOfCar(), reservationStep.setCategorySelectedFromReservationForm());
        } catch (NoSuchElementException e) {
            logger.info("Nothing car in this period");
        }
    }
}