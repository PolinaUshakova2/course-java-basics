package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int totalSeconds) {
        this.seconds = totalSeconds;
    }
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public void setMinutes(int hours) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return this.seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getTotalSeconds() {
        int totalSeconds = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        return totalSeconds;
    }
}
