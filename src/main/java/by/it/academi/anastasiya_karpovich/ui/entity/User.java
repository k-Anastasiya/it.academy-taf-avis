package by.it.academi.anastasiya_karpovich.ui.entity;

import by.it.academi.anastasiya_karpovich.ui.utils.Random;

import static com.google.common.base.Ascii.toUpperCase;


public class User {
    private static String firstName;
    private static String lastName;
    private static String mobileNumber = "1568974236";
    private static String emailAddress;
    private static String password = "a95@$Fjkjlj";
    private static String addressLine1 = "432 Addison St. Arkington";
    private static String zip = "02476";
    private static String city = "Arlington";
    private static String state = "MA";

    public User() {
        this.firstName = firstName = toUpperCase(Random.generateText());
        this.lastName = lastName = Random.generateText();
        this.emailAddress = Random.generateText() + "@gmail.com";
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getMobileNumber() {
        return mobileNumber;
    }

    public static String getEmailAddress() {
        return emailAddress;
    }

    public static String getPassword() {
        return password;
    }

    public static String getAddressLine1() {
        return addressLine1;
    }

    public static String getZip() {
        return zip;
    }

    public static String getCity() {
        return city;
    }

    public static String getState() {
        return state;
    }
}
