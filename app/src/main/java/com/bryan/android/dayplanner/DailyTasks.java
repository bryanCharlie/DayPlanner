package com.bryan.android.dayplanner;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Home on 4/14/2016.
 */
public class DailyTasks {
    private static DailyTasks sTasksCompleted;
    private static List<Task> sTaskList;

    public static DailyTasks get(Context context){
        if(sTasksCompleted == null){
            sTasksCompleted = new DailyTasks(context);
        }
        return sTasksCompleted;
    }

    private DailyTasks(Context context){
        sTaskList = new ArrayList<>();
    }

    public void addTask(Task task){
        sTaskList.add(task);
    }

    public List<Task> getTasks(){
        return sTaskList;
    }

    public Task getTask(UUID id){
        for(Task l : sTaskList){
            if(l.getId() == id)
                return l;
        }

        return null;
    }


}
