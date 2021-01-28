package com.company;

public class ChristmasTask  implements Task{
    private String taskName = "";
    private int day = 1;
    private int hours = 0;
    private String name = "";

    public ChristmasTask(){}

    public ChristmasTask(String taskName, int day, int hours, String name){
        this.taskName = taskName;
        this.day = day;
        this.hours = hours;
        this.name = name;
    }


    public String getTaskName(){
        return this.taskName;
    }

    public int getDay(){
        return this.day;
    }

    public int getHours(){
        return this.hours;
    }

    public String getName(){
        return this.name;
    }


    public void doTask(){
        System.out.println(" " + this.taskName + " - WYKONANO");
    }
}
