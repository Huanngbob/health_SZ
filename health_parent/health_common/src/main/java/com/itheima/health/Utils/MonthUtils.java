package com.itheima.health.Utils;


import java.util.ArrayList;
import java.util.List;

public class MonthUtils {
    public static List<String> getQueryMonths(String[] value){
        List<String> result = new ArrayList<>();
        //
        String[] s1 = value[0].split(" ");
        String[] s2 = value[1].split(" ");
        int startYear = Integer.parseInt(s1[3]);
        int startMoth = turn(s1[1]);
        int endYear = Integer.parseInt(s2[3]);
        int endMoth = turn(s2[1]);
        if(startYear == endYear){
            int months = endMoth - startMoth;
            for (int i = 0; i < months + 1; i++) {
                String Date = s1[3] + "-" + (startMoth + i);
                result.add(Date);
            }
            return result;
        }else {
                int months = 12 - startMoth;
                for (int i = 0; i < months + 1; i++) {
                    String Date = s1[3] + "-" + (startMoth + i);
                    result.add(Date);
                }
                for (int i = 1; i <= endMoth; i++) {
                    String Date = s2[3] + "-" + (i);
                    result.add(Date);
                }
                return result;
            /*else i1f(years > 1){
                int months = 12 - startMoth;
                for (int i = 0; i < months + 1; i++) {
                    String Date = s1[3] + "-" + (startMoth + i);
                    result.add(Date);
                }
                for (int i = 0; i < (years - 1); i++) {
                    for (int j = 0; j < 12; j++) {
                        String Date = (s1[3] + i) + "-" + (startMoth + j);
                        result.add(Date);
                    }
                }
                for (int i = 1; i <= endMoth; i++) {
                    String Date = s2[3] + "-" + (i);
                    result.add(Date);
                }
                return result;
            }*/
        }
    }

    public static int turn(String month){
        switch (month) {
            case "Jan":
                return 1;
            case "Feb":
                return 2;
            case "Mar":
                return 3;
            case "Apr":
                return 4;
            case "May":
                return 5;
            case "Jun":
                return 6;
            case "Jul":
                return 7;
            case "Aug":
                return 8;
            case "Sept":
                return 9;
            case "Oct":
                return 10;
            case "Nov":
                return 11;
            case "Dec":
                return 12;
            default:
                return -1;
            }
    }
}
