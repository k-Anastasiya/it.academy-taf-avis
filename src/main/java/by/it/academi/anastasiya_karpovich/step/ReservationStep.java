package by.it.academi.anastasiya_karpovich.step;

import by.it.academi.anastasiya_karpovich.page.ReservationsPage;
import by.it.academi.anastasiya_karpovich.utils.Date;

public class ReservationStep extends ReservationsPage {
    public ReservationStep goToReservationPage() {
        new ReservationStep()
                .openPage()
                .clickLinkReservation()
                .clickLinkMakeReservation();
        return this;
    }

    public ReservationStep fillReservationForm(Date date) {
        ReservationsPage reservationStep = new ReservationStep()
                .typePickUpLocation()
                .clickSelectPickUpLocation()
                .typeDateFrom(date)
                .typeReturnLocation()
                .clickReturnLocation()
                .typeToDate(date)
                .clickButtonSelectCar();
                reservationStep.getCategoryOsSelectedCar();
              reservationStep.clickLinkPayLater()
                .clickButtonProceedToCheckout();
        return this;
    }

}
