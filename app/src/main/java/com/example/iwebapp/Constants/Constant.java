package com.example.iwebapp.Constants;

import com.example.iwebapp.Model.AbsentPOJO;
import com.example.iwebapp.Model.MonthsPOJO;
import com.example.iwebapp.Model.TimeTablePOJO;
import com.example.iwebapp.Model.YearPOJO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Constant {

    public static ArrayList<MonthsPOJO> getMonths (){

        ArrayList<MonthsPOJO> monthsList = new ArrayList<>();

        MonthsPOJO monthsPOJO = new MonthsPOJO();
        monthsPOJO.setMonthId("1");
        monthsPOJO.setMonthName("January");
        monthsList.add(monthsPOJO);

        MonthsPOJO monthsPOJO2 = new MonthsPOJO();
        monthsPOJO2.setMonthId("2");
        monthsPOJO2.setMonthName("Febraury");
        monthsList.add(monthsPOJO2);

        MonthsPOJO monthsPOJO3 = new MonthsPOJO();
        monthsPOJO3.setMonthId("3");
        monthsPOJO3.setMonthName("March");
        monthsList.add(monthsPOJO3);

        MonthsPOJO monthsPOJO4 = new MonthsPOJO();
        monthsPOJO4.setMonthId("4");
        monthsPOJO4.setMonthName("April");
        monthsList.add(monthsPOJO4);

        MonthsPOJO monthsPOJO5 = new MonthsPOJO();
        monthsPOJO5.setMonthId("5");
        monthsPOJO5.setMonthName("May");
        monthsList.add(monthsPOJO5);


        MonthsPOJO monthsPOJO6 = new MonthsPOJO();
        monthsPOJO6.setMonthId("6");
        monthsPOJO6.setMonthName("June");
        monthsList.add(monthsPOJO6);

        MonthsPOJO monthsPOJO7 = new MonthsPOJO();
        monthsPOJO7.setMonthId("7");
        monthsPOJO7.setMonthName("July");
        monthsList.add(monthsPOJO7);

        MonthsPOJO monthsPOJO8 = new MonthsPOJO();
        monthsPOJO8.setMonthId("8");
        monthsPOJO8.setMonthName("August");
        monthsList.add(monthsPOJO8);

        MonthsPOJO monthsPOJO9 = new MonthsPOJO();
        monthsPOJO9.setMonthId("9");
        monthsPOJO9.setMonthName("September");
        monthsList.add(monthsPOJO9);

        MonthsPOJO monthsPOJO10 = new MonthsPOJO();
        monthsPOJO10.setMonthId("10");
        monthsPOJO10.setMonthName("October");
        monthsList.add(monthsPOJO10);

        MonthsPOJO monthsPOJO11 = new MonthsPOJO();
        monthsPOJO11.setMonthId("11");
        monthsPOJO11.setMonthName("November");
        monthsList.add(monthsPOJO11);

        MonthsPOJO monthsPOJO12 = new MonthsPOJO();
        monthsPOJO12.setMonthId("12");
        monthsPOJO12.setMonthName("December");
        monthsList.add(monthsPOJO12);



      return monthsList;
    }

    public static ArrayList<YearPOJO> getYears() {
        ArrayList<YearPOJO> yearList = new ArrayList<>();

        YearPOJO yearPOJO = new YearPOJO();
        yearPOJO.setYearId("0");
        yearPOJO.setYearName("2015");
        yearList.add(yearPOJO);


        YearPOJO yearPOJO1 = new YearPOJO();
        yearPOJO1.setYearId("1");
        yearPOJO1.setYearName("2016");
        yearList.add(yearPOJO1);

        YearPOJO yearPOJO2 = new YearPOJO();
        yearPOJO2.setYearId("2");
        yearPOJO2.setYearName("2017");
        yearList.add(yearPOJO2);

        YearPOJO yearPOJO3 = new YearPOJO();
        yearPOJO3.setYearId("3");
        yearPOJO3.setYearName("2018");
        yearList.add(yearPOJO3);

        YearPOJO yearPOJO4 = new YearPOJO();
        yearPOJO4.setYearId("4");
        yearPOJO4.setYearName("2019");
        yearList.add(yearPOJO4);

        YearPOJO yearPOJO5 = new YearPOJO();
        yearPOJO5.setYearId("5");
        yearPOJO5.setYearName("2020");
        yearList.add(yearPOJO5);


        return yearList;
    }

    public static ArrayList<AbsentPOJO> getAbsentList() {

        ArrayList<AbsentPOJO> absentdata = new ArrayList<>();

        AbsentPOJO absentPOJO = new AbsentPOJO();
        absentPOJO.setAbsentId("1");
        absentPOJO.setAbsentDate("10 May 2017");
        absentdata.add(absentPOJO);

        AbsentPOJO absentPOJO1 = new AbsentPOJO();
        absentPOJO1.setAbsentId("2");
        absentPOJO1.setAbsentDate("11 May 2017");
        absentdata.add(absentPOJO1);

        AbsentPOJO absentPOJO2 = new AbsentPOJO();
        absentPOJO2.setAbsentId("3");
        absentPOJO2.setAbsentDate("12 May 2017");
        absentdata.add(absentPOJO2);


        AbsentPOJO absentPOJO4 = new AbsentPOJO();
        absentPOJO4.setAbsentId("4");
        absentPOJO4.setAbsentDate("13 May 2017");
        absentdata.add(absentPOJO4);

       return absentdata;
    }

    public static  ArrayList<TimeTablePOJO> getTimeTable() {

        ArrayList<TimeTablePOJO> timeTableData = new ArrayList<>();

        TimeTablePOJO pojo = new TimeTablePOJO();
        pojo.setTimeTableId("1");
        pojo.setTiming("10.00 - 11.50");
        pojo.setLecture("GC (General Chemistry)");
        timeTableData.add(pojo);

        TimeTablePOJO pojo1 = new TimeTablePOJO();
        pojo1.setTimeTableId("2");
        pojo1.setTiming("12.00 - 12.50");
        pojo1.setLecture("Pharmacy Lab I (BPH_C_205_T)");
        timeTableData.add(pojo1);

        TimeTablePOJO pojo2 = new TimeTablePOJO();
        pojo2.setTimeTableId("3");
        pojo2.setTiming("12.50 - 13.40");
        pojo2.setLecture("DCP (Dispencong and Community Pharmacy)");
        timeTableData.add(pojo2);

        TimeTablePOJO pojo3 = new TimeTablePOJO();
        pojo3.setTimeTableId("4");
        pojo3.setTiming("14.10 - 13.40");
        pojo3.setLecture("DCPL (Dispencing and Commmunity Pharmacy Lab)");
        timeTableData.add(pojo3);

        TimeTablePOJO pojo4 = new TimeTablePOJO();
        pojo4.setTimeTableId("5");
        pojo4.setTiming("15.00 - 15.50");
        pojo4.setLecture("Environmental Science (BHP_C_205_T)");
        timeTableData.add(pojo4);


        return timeTableData;
    }

}
