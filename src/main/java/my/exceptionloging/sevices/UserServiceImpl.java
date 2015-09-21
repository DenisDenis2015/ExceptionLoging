package my.exceptionloging.sevices;

import my.exceptionloging.dao.DaoException;
import my.exceptionloging.dao.UserDao;
import my.exceptionloging.domain.User;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getById(int id) {
        try {
            return userDao.getById(id);
        } catch (DaoException e) {
            // В message пишем максимально много информации об условиях при которых случилась ошибка.
            String message = "The getById method has throwen an exception";
            throw new BusinessException(message, e);
        }
    }
}
