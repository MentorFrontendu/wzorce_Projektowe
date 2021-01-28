package com.company;

// dekorator
public class ImportantChristmasTask  implements Task {
    private final ChristmasTask baseChristmasTask;
    private final String extraMsg = "WAŻNE!";

    public ImportantChristmasTask(ChristmasTask task){
        this.baseChristmasTask = task;
    }

    public int getDay(){
       return this.baseChristmasTask.getDay();
    }

    public void doTask(){
        System.out.print(extraMsg);
        this.baseChristmasTask.doTask();
    }
}
