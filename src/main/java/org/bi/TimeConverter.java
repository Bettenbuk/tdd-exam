package org.bi;

import java.time.LocalDateTime;

public class TimeConverter {
    public static String convertToMetroTimeFormat(LocalDateTime time) {
        String year = String.valueOf(Integer.toString(time.getYear()).charAt(3));
        return year;
    }
}
