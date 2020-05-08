package com.example.todolist.db;

import android.provider.BaseColumns;

public class TaskContract {
    //bd
    public static final String DB_NAME = "com.example.todolist.db";
    public static final int BD_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "task";
        public static final String COL_TASK_TITLE = "title";
    }
}
