package org.example;

import java.time.LocalDateTime;

public class Task {
    public String title;
    public String description;
    public LocalDateTime creationDate;
    public boolean isCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.creationDate = LocalDateTime.now();
        this.isCompleted = false;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
