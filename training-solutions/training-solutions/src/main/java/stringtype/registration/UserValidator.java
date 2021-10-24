package stringtype.registration;

public class UserValidator {

    public boolean isValidUserName(String userName) {
        return userName.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        boolean condition;

        condition = password1.length() > 7;
        condition &= password1.equals(password2);

        return condition;
    }

    public boolean isValidEmail(String email) {
        boolean condition;

        condition = email.indexOf("@") > 0;
        condition &= email.indexOf("@") < 0 ? false : email.substring(email.indexOf("@")).indexOf(".") > 1;
        condition &= email.length() == 0 ? false : email.substring(email.length() - 1).indexOf(".") < 0;

        return condition;
    }
}