package my.exceptionloging.dao;

/**
 * Исключение дао слоя
 */
public class DaoException extends RuntimeException {
    /**
     * Исключение дао слоя
     *
     * @param message текст описывающий условия при которых была ошибка
     * @param cause   причина (исключение)
     */
    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
