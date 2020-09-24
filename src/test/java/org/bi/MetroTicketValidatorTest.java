package org.bi;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class MetroTicketValidatorTest {
    @Test
    public void ticketIsExpired(){
        LocalDateTime ticketUsingStartTime= LocalDateTime.now().minusMinutes(81);
        String ticket = "0643xxx"+TimeConverter.convertToMetroTimeFormat(ticketUsingStartTime);
        Assert.assertFalse(MetroTicketValidator.isValid(ticket));
    }
}
