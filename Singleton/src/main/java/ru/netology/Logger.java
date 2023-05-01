package ru.netology;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Logger {
    protected int num = 1;

    public void log(String msg) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("[" + time.format(formatter) + " " + num + "] " + msg);
        ++num;
    }

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}