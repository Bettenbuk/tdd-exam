package org.bi;

public class MetroTicketValidator {

    private static final int TIME_LENGTH_IN_TICKET = 9;
    private static final int VALIDATION_TIME = 80;

    public static boolean isValid(String ticket) {
        return !isExpired(ticket);
    }

    private static boolean isExpired(String ticket) {
        String ticketUsingStartTime = ticket.substring(ticket.length() - TIME_LENGTH_IN_TICKET);

        return ticketUsingStartTime.compareTo(
                TimeConverter.getLastValidTimeInMetroTimeFormat(VALIDATION_TIME )) < 0;
    }
}
