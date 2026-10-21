package com.kerlygdev;

import java.time.LocalDate;

public class DailyLog {
    private LocalDate date;
    private String topicName;
    private String text;

    @Override
    public String toString() {
        return "DailyLog{" +
                "date=" + date +
                ", topicName='" + topicName + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public DailyLog(LocalDate date, String topicName, String text) {
        this.date = date;
        this.topicName = topicName;
        this.text = text;


    }
}
