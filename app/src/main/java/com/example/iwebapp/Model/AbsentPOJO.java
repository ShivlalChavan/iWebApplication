package com.example.iwebapp.Model;

import java.io.Serializable;

public class AbsentPOJO implements Serializable {

    private String absentId;
    private String absentDate;

    public String getAbsentId() {
        return absentId;
    }

    public void setAbsentId(String absentId) {
        this.absentId = absentId;
    }

    public String getAbsentDate() {
        return absentDate;
    }

    public void setAbsentDate(String absentDate) {
        this.absentDate = absentDate;
    }
}
