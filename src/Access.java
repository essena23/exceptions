import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Access {
    public static void giveAccess(
            String login,
            String password,
            String confirmPassword
    ) {
        for (int i = 0; i < login.length(); i++) {
            if (!Character.isLetterOrDigit(login.charAt(i)) && login.charAt(i) != '_' && login.length() <= 20) {
                throw new WrongLoginException("Логин не соответсвует условиям");
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)) && password.charAt(i) != '_' && password.length() <= 20) {
                throw new WrongLoginException("Пароль не соответствует условиям");
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ваш пароль не совпадает с ожидаемым");
        }

    }
}
