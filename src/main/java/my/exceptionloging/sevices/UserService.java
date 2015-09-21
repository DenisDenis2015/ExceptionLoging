package my.exceptionloging.sevices;

import my.exceptionloging.domain.User;

/**
 * Обычный сервис интерфейс
 */
public interface UserService {
    /**
     * Обычный сервисный метод
     */
    User getById(int id);
}
