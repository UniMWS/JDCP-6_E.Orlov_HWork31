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
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer < treshold) {
                logger.log("Элемент " + integer + " проходит");
                result.add(integer);
            } else logger.log("Элемент " + integer + " не проходит");
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        return result;
    }
}