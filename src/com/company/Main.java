package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        ChristmasTask task1 = new ChristmasTaskBuilder().setTaskName("Pieczenie pierników").setDay(22).build();
        ChristmasTask task2 = new ChristmasTaskBuilder().setTaskName("Sprzątanie").setDay(24).build();
        ChristmasTask task3 = new ChristmasTaskBuilder().setTaskName("Super zadanie").setDay(24).build();

        ImportantChristmasTask importantTask1 = new ImportantChristmasTask(task2);

        tasks.add(task1);
        tasks.add(importantTask1);
        tasks.add(task3);

        Visitor visitor = new Visitor();
        visitor.visit(tasks);

    }
}
