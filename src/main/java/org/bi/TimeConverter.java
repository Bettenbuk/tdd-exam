package org.bi;

import java.time.LocalDateTime;

public class TimeConverter {

    public static final String TWO_DIGIT_FORMAT = "%02d";

    public static String convertToMetroTimeFormat(LocalDateTime time) {
        String year = String.valueOf(Integer.toString(time.getYear()).charAt(3));
        String month = String.format(TWO_DIGIT_FORMAT,time.getMonthValue());
        String day = String.format(TWO_DIGIT_FORMAT,time.getDayOfMonth());
        String hour = String.format(TWO_DIGIT_FORMAT,time.getHour());
        String minute = String.format(TWO_DIGIT_FORMAT,time.getMinute());
        return year+month+day+hour+minute;
    }

    public static String getLastValidTimeInMetroTimeFormat(int timeCorrection) {
        LocalDateTime expiredTime = LocalDateTime.now().minusMinutes(timeCorrection);
        return convertToMetroTimeFormat(expiredTime);
    }

    public static String getNowInMetroTimeFormat() {
        return getLastValidTimeInMetroTimeFormat(0);
    }

    private TimeConverter(){}
}
