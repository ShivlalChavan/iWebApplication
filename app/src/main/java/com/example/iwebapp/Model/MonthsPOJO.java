package com.example.iwebapp.Model;

import java.io.Serializable;

public class MonthsPOJO implements Serializable {

    private String monthId;
    private String monthName;

    public String getMonthId() {
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }
}
