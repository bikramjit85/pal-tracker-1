package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours ) {

        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long projectId, long userId, LocalDate parse, int hours) {

        this.date = parse;
        this.projectId = projectId;
        this.userId = userId;
         this.hours = hours;
    }

    public TimeEntry() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TimeEntry timeEntry = (TimeEntry) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()

                .append(projectId, timeEntry.projectId)
                .append(userId, timeEntry.userId)
                 .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(projectId)
                .append(userId)
                 .toHashCode();
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }
}
