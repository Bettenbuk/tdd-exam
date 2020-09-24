package org.bi;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class TimeConverterTest {
    @Test
    public void convertToMetroTimeFormat(){
        LocalDateTime time = LocalDateTime.parse("2007-12-03T10:15:30");
        Assert.assertEquals("7", TimeConverter.convertToMetroTimeFormat(time));
    }
}
