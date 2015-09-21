package my.exceptionloging.dao;

import my.exceptionloging.domain.User;

/**
 * Обычный дао интерфейс
 */
public interface UserDao {
    /**
     * Обычный дао метод
     */
    User getById(int id);
}
