package com.mangohacks.fiu.activeease;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "activity_table")
public class Activity {
    private String name;
    private String description;
    private int priority;
    @PrimaryKey(autoGenerate = true)
    private int id;

    public Activity(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public int getId() {
        return id;
    }
}
