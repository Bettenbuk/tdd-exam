package org.bi;

import java.time.LocalDateTime;

public class TimeConverter {

    public static final String TWO_DIGIT_FORMAT = "%02d";

    public static String convertToMetroTimeFormat(LocalDateTime time) {
        String year = String.valueOf(Integer.toString(time.getYear()).charAt(3));
        String month = String.format(TWO_DIGIT_FORMAT,time.getMonthValue());
        return year+month;
    }
}
