package com.company;

import java.util.List;

public class Visitor {

    public void visit( List<Task> tasks) {
        for (Task task : tasks) {
            if(task.getDay() == 24){
                task.doTask();
            }
        }
    }
}
