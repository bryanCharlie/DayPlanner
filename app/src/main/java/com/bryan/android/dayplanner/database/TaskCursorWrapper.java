package com.bryan.android.dayplanner.database;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.bryan.android.dayplanner.database.TaskDbSchema.TaskTable;

import com.bryan.android.dayplanner.Task;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Home on 6/6/2016.
 */
public class TaskCursorWrapper extends CursorWrapper{

    public TaskCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Task getTask(){
        String uuid = getString(getColumnIndex(TaskTable.Cols.UUID));
        String title = getString(getColumnIndex(TaskTable.Cols.TITLE));
        long date = getLong(getColumnIndex(TaskTable.Cols.DATE));
        int completed = getInt(getColumnIndex(TaskTable.Cols.COMPLETED));

        Task task = new Task(UUID.fromString(uuid));
        task.setmTaskName(title);
        task.setDate(new Date(date));
        task.setIsCompleted(completed != 0);

        return task;
    }
}
