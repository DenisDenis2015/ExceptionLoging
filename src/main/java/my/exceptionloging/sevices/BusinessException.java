package my.exceptionloging.sevices;

/**
 * Исключение бизнес слоя
 */
public class BusinessException extends RuntimeException {
    /**
     * Исключение бизнес слоя
     *
     * @param message текст описывающий условия при которых была ошибка
     * @param cause   причина (исключение)
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
