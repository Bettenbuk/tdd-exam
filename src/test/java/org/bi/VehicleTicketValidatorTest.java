package org.bi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTicketValidatorTest {

    @Test
    public void isValidVehicleTicketTest() {
        String vehicleFlightNumber = "111";
        VehicleTicketValidator vehicleTicketValidator = new VehicleTicketValidator(vehicleFlightNumber);
        Assert.assertTrue(vehicleTicketValidator.isValid(vehicleFlightNumber));
    }
}