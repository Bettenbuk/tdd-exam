package org.bi;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class MetroTicketValidatorTest {

    private static final int VALIDATION_TIME = 80;

    @Test
    public void ticketIsExpired(){
        LocalDateTime ticketUsingStartTime= LocalDateTime.now().minusMinutes(VALIDATION_TIME+1);
        String ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertFalse(MetroTicketValidator.isValid(ticket));
    }

    @Test
    public void ticketFromPast(){
        LocalDateTime ticketUsingStartTime= LocalDateTime.now().plusMinutes(1);
        String ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertFalse(MetroTicketValidator.isValid(ticket));
    }
}
