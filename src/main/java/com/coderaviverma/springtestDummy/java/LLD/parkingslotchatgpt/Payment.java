package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

public class Payment {

    private Ticket ticket;
    private double amount;
    private boolean isPaid;

    public Payment(Ticket ticket, double hourlyRate) {
        this.ticket = ticket;
        long duration = ((System.currentTimeMillis() - ticket.getEntryTime()) / 3600000);
        this.amount = duration * hourlyRate;
        this.isPaid = false;
    }

    public boolean processPayment(){

        System.out.println("Payment Paid! Exit....");
        return !isPaid;
    }
}
