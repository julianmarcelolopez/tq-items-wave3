package com.neocamp.moneytransfers.application.service;

import com.neocamp.moneytransfers.application.port.in.SendMoneyCommand;
import com.neocamp.moneytransfers.application.port.in.SendMoneyPort;
import com.neocamp.moneytransfers.application.port.out.LoadAccountPort;
import com.neocamp.moneytransfers.application.port.out.UpdateAccountPort;
import com.neocamp.moneytransfers.domain.Account;
import com.neocamp.moneytransfers.common.UseCase;

import javax.transaction.Transactional;

@UseCase
public class SendMoneyService implements SendMoneyPort {

    private final LoadAccountPort loadAccountPort;
    private final UpdateAccountPort updateAccountPort;

    public SendMoneyService(LoadAccountPort loadAccountPort, UpdateAccountPort updateAccountPort) {
        this.loadAccountPort = loadAccountPort;
        this.updateAccountPort = updateAccountPort;
    }

    @Transactional
    @Override
    public boolean send(SendMoneyCommand command) {

        Account source = loadAccountPort.load(command.getSourceId());
        Account target = loadAccountPort.load(command.getTargetId());

        if(!source.isBalanceGreaterThan(command.getAmount())) {
            throw new RuntimeException("Source account not have enough balance amount ... ");
        }

        target.plus(command.getAmount());
        source.subtract(command.getAmount());

        updateAccountPort.update(source);
        updateAccountPort.update(target);

        return true;
    }
}
