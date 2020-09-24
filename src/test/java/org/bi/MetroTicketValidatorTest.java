package org.bi;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class MetroTicketValidatorTest {

    private static final int VALIDATION_TIME = 80;
    private MetroTicketValidator metroTicketValidator = new MetroTicketValidator();
    private LocalDateTime ticketUsingStartTime;
    private String ticket;

    @Test
    public void ticketIsExpired(){
        ticketUsingStartTime= LocalDateTime.now().minusMinutes(VALIDATION_TIME+1);
        ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertFalse(metroTicketValidator.isValid(ticket));
    }

    @Test
    public void ticketFromPast(){
        ticketUsingStartTime = LocalDateTime.now().plusMinutes(1);
        ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertFalse(metroTicketValidator.isValid(ticket));
    }

    @Test
    public void validTicketInCaseLastMinute(){
        ticketUsingStartTime = LocalDateTime.now().minusMinutes(VALIDATION_TIME - 1);
        ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertTrue(metroTicketValidator.isValid(ticket));
    }

    @Test
    public void validTicketInCaseImmediately(){
        ticketUsingStartTime = LocalDateTime.now().minusMinutes(0);
        ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertTrue(metroTicketValidator.isValid(ticket));
    }
}
