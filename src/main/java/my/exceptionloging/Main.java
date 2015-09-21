import my.exceptionloging.dao.UserDao;
import my.exceptionloging.dao.UserDaoImpl;
import my.exceptionloging.sevices.BusinessException;
import my.exceptionloging.sevices.UserService;
import my.exceptionloging.sevices.UserServiceImpl;

public class Main {

    /**
     * Запусти меня.
     */
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserServiceImpl(userDao);
        try {
            userService.getById(1);
        } catch (BusinessException e) {
            logError("Error message!", e);
        }
    }

    /**
     * Метод который логирует ощибки. Можете использовать свой логер.
     *
     * @param message текст описывающий условия при которых была ошибка
     * @param cause   причина (исключение)
     */
    private static void logError(String message, Throwable cause) {
        System.out.println(message);
        cause.printStackTrace();
    }
}
