package com.mihajlo.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {

    private String shorDescription;
    private String details;
    private LocalDate deadline;

    public TodoItem(String shorDescription, String details, LocalDate deadline) {
        this.shorDescription = shorDescription;
        this.details = details;
        this.deadline = deadline;
    }

    public String getShorDescription() {
        return shorDescription;
    }

    public void setShorDescription(String shorDescription) {
        this.shorDescription = shorDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

}
