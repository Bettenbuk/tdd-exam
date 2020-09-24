package org.bi;
import org.junit.Assert;
import org.junit.Test;

public class MetroTicketValidatorTest {
    @Test
    public void ticketIsExpired(){
        String ticket = "0643xxx009240949";
        Assert.assertTrue(MetroTicketValidator.isValid(ticket));
    }
}
