package by.it.academi.anastasiya_karpovich.entity;

public class ErrorMessage {
  public static String errorMessageWhenEmptyCells = "There are multiple errors on the form. Please correct them and resubmit the form.";
  public static String errorMessageWhenEmptyFirstNaneInput = "First Name is a required field.";
  public static String errorMessageWhenEmptyLastName = "Last Name is a required field.";
  public static String errorMessageWhenEmptyPhoneNumber = "Telephone is a required field.";
  public static String errorMessageWhenEmptyEmailAddress = "Email Address is a required field.";
  public static String errorMessageWhenEmptyPassword = "Password is a required field";
  public static String errorMessageWhenEmptyAddressLine = "Address Line 1 is a required field.";
  public static String errorMessageWhenEmptyZip = "Zip/Postal Code is a required field.";
  public static String errorMessageWhenFirstNameFillUncorrectedData = "First Name cannot contain numeric or special characters. Please remove and try again.";
  public static String errorMessageWhenLastNameFillUncorrectedData = "Last Name cannot contain special characters. Please remove and try again.";
  public static String errorMessageWhenPoneFilledUncorrectedDate = "Please check the format in the Telephone field and try again. (commas and other special characters are not accepted in this field)";
  public static String errorMessageWhenEmailFilledUncorrectedDate = "Please enter a valid Email Address.";
}
