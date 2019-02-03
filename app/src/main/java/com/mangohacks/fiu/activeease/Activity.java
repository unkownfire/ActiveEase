package com.mangohacks.fiu.activeease;


import java.util.ArrayList;
import java.util.HashMap;

public class Activity {
    private String name;
    private String description;
    private int priority;
    private ArrayList<Activity> subActivities;
    private HashMap<String, double[]>  acceptableRanges = new HashMap<>();
    private HashMap<String, double[]> preferredRanges = new HashMap<>();
    private HashMap<String, double[]> userRanges = new HashMap<>();
    public Activity(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;

    }

    public HashMap<String, double[]> getAcceptableRanges() {
        return acceptableRanges;
    }

    public HashMap<String, double[]> getPreferredRanges() {
        return preferredRanges;

    }

    public HashMap<String, double[]> getUserRanges() {
        return userRanges;
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

}
