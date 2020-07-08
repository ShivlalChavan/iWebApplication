package com.example.iwebapp.Model;

import java.io.Serializable;

public class TimeTablePOJO implements Serializable {

    private String timeTableId;
    private String timing;
    private String lecture;

    public String getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(String timeTableId) {
        this.timeTableId = timeTableId;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }
}
