package org.bi;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class TimeConverterTest {
    @Test
    public void convertToMetroTimeFormatTest(){
        LocalDateTime time = LocalDateTime.parse("2007-09-03T10:15:30");
        Assert.assertEquals("709031015", TimeConverter.convertToMetroTimeFormat(time));
    }

    @Test
    public void getLastValidTimeInMetroTimeFormatTest(){
        String starTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        String checkTime = TimeConverter.getLastValidTimeInMetroTimeFormat(0);
        String endTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }
}
