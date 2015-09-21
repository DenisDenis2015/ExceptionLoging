package my.exceptionloging.dao;

import my.exceptionloging.domain.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User getById(int id) {
        try {
            throwableMethod();
            return new User();
        } catch (Exception e) {
            // В message пишем максимально много информации об условиях при которых случилась ошибка.
            String message = "The throwableMethod has throwen an exception";
            throw new DaoException(message, e);
        }
    }

    /**
     * Метод который просто выкидывает RuntimeException
     */
    private User throwableMethod() {
        throw new RuntimeException();
    }
}
