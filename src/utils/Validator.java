package utils;

public class Validator {
    public static boolean isValidEmail(String email) {
        //regex _ email: abc@cde.g.h
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean isValidBirthDate(String birthDay){
        //regex date : dd/MM/yyyy
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])$";
        return birthDay.matches(regex);
    }
}
