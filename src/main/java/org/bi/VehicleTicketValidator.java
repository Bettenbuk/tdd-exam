package org.bi;

public class VehicleTicketValidator {
    private final String vehicleFlightNumber;

    public VehicleTicketValidator(String vehicleNumber) {
        this.vehicleFlightNumber = vehicleNumber;
    }

    public boolean isValid(String ticket){
        return ticket.startsWith(vehicleFlightNumber);
    }
}
