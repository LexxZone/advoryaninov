package ru.job4j.condition;

/**
 * Класс Глупый Бот.
 * Created by Alex Dvoryaninov on 11.03.18
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param   question
     *          Вопрос от клиента.
     * @return  Ответ
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
