package org.bi;

public class MetroTicketValidator {

    private static final int TIME_LENGTH_IN_TICKET = 9;

    public static boolean isValid(String ticket) {
        return !isExpired(ticket);
    }

    private static boolean isExpired(String ticket) {
        String ticketUsingStartTime = ticket.substring(ticket.length() - TIME_LENGTH_IN_TICKET);
        return ticketUsingStartTime.compareTo(
                TimeConverter.getNowInMetroTimeFormat()) < 0;
    }
}
