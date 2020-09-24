package org.bi;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTicketValidatorTest {
    private final String vehicleFlightNumber = "111";
    private VehicleTicketValidator vehicleTicketValidator;

    @Test
    public void isValidVehicleTicketTest() {
        String vehicleFlightNumber = "111";
        vehicleTicketValidator = new VehicleTicketValidator(vehicleFlightNumber);
        Assert.assertTrue(vehicleTicketValidator.isValid(vehicleFlightNumber));
    }

    @Test
    public void isNotValidVehicleTicketTest() {
        String vehicleFlightNumber = "111";
        vehicleTicketValidator = new VehicleTicketValidator(vehicleFlightNumber);
        Assert.assertFalse(vehicleTicketValidator.isValid("INVALID"));
    }
}