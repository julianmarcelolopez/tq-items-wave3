package com.neocamp.moneytransfers.application.port.in;

public interface SendMoneyPort {
    public boolean send(SendMoneyCommand command);
}
