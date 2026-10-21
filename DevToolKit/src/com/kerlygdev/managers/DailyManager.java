package com.kerlygdev.managers;
import com.kerlygdev.DailyLog;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DailyManager {
    private List<DailyLog> logs = new ArrayList<>();

    public void addLog(LocalDate date, String topicName, String text) {
        logs.add(new DailyLog(date, topicName, text));
    }
    public void showLogs() {
        for (DailyLog log : logs) {
            System.out.println(log);
        }

    }
}
