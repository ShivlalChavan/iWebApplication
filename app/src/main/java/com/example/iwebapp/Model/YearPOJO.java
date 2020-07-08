package com.example.iwebapp.Model;

import java.io.Serializable;

public class YearPOJO implements Serializable {

    private String yearId;
    private String yearName;

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }



}
