package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = list.stream()
                .peek(integer -> logger.log("Элемент " + integer
                        + (integer >= treshold ? " не проходит" : " проходит")))
                .filter(integer -> integer < treshold)
                .toList();
        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        return result;
    }
}