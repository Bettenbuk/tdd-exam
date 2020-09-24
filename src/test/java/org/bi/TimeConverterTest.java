package org.bi;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class TimeConverterTest {
    private final LocalDateTime time = LocalDateTime.parse("2007-09-03T10:15:30");
    private String starTime;
    private String checkTime;
    private String endTime;

    @Test
    public void convertToMetroTimeFormatTest(){
        Assert.assertEquals("709031015", TimeConverter.convertToMetroTimeFormat(time));
    }

    @Test
    public void getLastValidTimeInMetroTimeFormatTest(){
        starTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        checkTime = TimeConverter.getLastValidTimeInMetroTimeFormat(0);
        endTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }

    @Test
    public void getNowInMetroTimeFormatTest(){
        starTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        checkTime = TimeConverter.getNowInMetroTimeFormat();
        endTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }

    @Test
    public void convertToVehicleTimeFormatTest(){
        Assert.assertEquals("09031015", TimeConverter.convertToVehicleTimeFormat(time));
    }

    @Test
    public void getLastValidTimeInVehicleTimeFormatTest(){
        starTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        checkTime = TimeConverter.getLastValidTimeInVehicleTimeFormat(0);
        endTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }

    @Test
    public void getNowInVehicleTimeFormatTest(){
        starTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        checkTime = TimeConverter.getNowInVehicleTimeFormat();
        endTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }
}
