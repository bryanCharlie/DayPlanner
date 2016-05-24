package com.bryan.android.dayplanner;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Home on 4/14/2016.
 */
public class Task {

    private String mTaskName;
    private UUID id;
    private Date dateCompleted;

    private Boolean isCompleted = false;

    public Task(){
        id = UUID.randomUUID();
        dateCompleted = new Date();
    }

    public void isCompleted(boolean bool){
        isCompleted = bool;
    }

    public void setDate(Date date){
        dateCompleted = date;
    }

    public UUID getId(){
        return id;
    }
    public Date getDateCompleted() {
        return dateCompleted;
    }
    public String getTaskName() {
        return mTaskName;
    }
    public Boolean getIsCompleted() {
        return isCompleted;
    }

}
