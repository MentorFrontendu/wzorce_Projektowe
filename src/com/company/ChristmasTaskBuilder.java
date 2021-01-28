package com.company;

public class ChristmasTaskBuilder{
    private String taskName = "";
    private int day = 1;
    private int hours = 0;
    private String name = "";

    public ChristmasTaskBuilder(String taskName, int day, int hours, String name){
        this.taskName = taskName;
        this.day = day;
        this.hours = hours;
        this.name = name;
    }
    public ChristmasTaskBuilder(){}

    public ChristmasTaskBuilder setTaskName(String taskName){
        this.taskName = taskName;
        return this;
    }

    public ChristmasTaskBuilder setDay(int day){
        this.day = day;
        return this;
    }

    public ChristmasTaskBuilder setHours(int hours){
        this.hours = hours;
        return this;
    }

    public ChristmasTaskBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ChristmasTask build(){
        return new ChristmasTask(taskName, day, hours, name);
    }

}
