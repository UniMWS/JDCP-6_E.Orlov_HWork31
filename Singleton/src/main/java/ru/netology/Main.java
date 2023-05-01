package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6, Евгений Орлов, ДЗ-31: " +
                "\"Порождающие шаблоны. Builder, Singleton, Factory Method, Abstract Factory, Prototype\"");
        System.out.println("Задача 2.\n");

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = input.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = input.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> list = getList(n, m);
        System.out.printf("Вот случайный список: %s\n", list.toString()
                .replaceAll("\\[|\\]|\\,", ""));

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = input.nextInt();
        Filter filter = new Filter(f);
        logger.log("Запускаем фильтрацию");
        System.out.printf("Отфильтрованный список: %s\n", filter.filterOut(list)
                .toString().replaceAll("\\[|\\]|\\,", ""));
        logger.log("Завершаем программу");
    }

    private static List<Integer> getList(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            list.add(random.nextInt(m));
        }
        return list;
    }
}