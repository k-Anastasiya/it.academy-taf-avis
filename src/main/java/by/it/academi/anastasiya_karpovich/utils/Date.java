package by.it.academi.anastasiya_karpovich.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    protected static final Logger logger = LogManager.getLogger();
    private  String dateFrom;
    private  String dateTo;

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public Date() {
        this.dateFrom = setDateFrom();
        this.dateTo = setDateTo();
    }

    public  String setDateFrom() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateOfReservation = currentDate.plusDays(1);
        logger.info("date from: " + dateOfReservation);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        String formattedCurrentDate = dateOfReservation.format((formatter));
        return formattedCurrentDate;
    }

    public  String setDateTo() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateOfReservation = currentDate.plusDays(14);
        logger.info("date to: " + dateOfReservation);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        String formattedCurrentDate = dateOfReservation.format((formatter));
        return formattedCurrentDate;
    }
}

