import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "login";
        String password = "password@";
        String confirmPassword = "confirmPassword";


        try {
            Access.giveAccess(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        }


    }
}