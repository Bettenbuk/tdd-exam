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

    @Test
    public void getNowInMetroTimeFormatTest(){
        String starTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        String checkTime = TimeConverter.getNowInMetroTimeFormat();
        String endTime = TimeConverter.convertToMetroTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }

    @Test
    public void convertToVehicleTimeFormatTest(){
        LocalDateTime time = LocalDateTime.parse("2007-09-03T10:15:30");
        Assert.assertEquals("09031015", TimeConverter.convertToVehicleTimeFormat(time));
    }

    @Test
    public void getLastValidTimeInVehicleTimeFormatTest(){
        String starTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        String checkTime = TimeConverter.getLastValidTimeInVehicleTimeFormat(0);
        String endTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }

    @Test
    public void getNowInVehicleTimeFormatTest(){
        String starTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        String checkTime = TimeConverter.getNowInVehicleTimeFormat();
        String endTime = TimeConverter.convertToVehicleTimeFormat(LocalDateTime.now());
        Assert.assertNotEquals(1, checkTime.compareTo(starTime));
        Assert.assertNotEquals(-1, checkTime.compareTo(endTime));
    }
}
