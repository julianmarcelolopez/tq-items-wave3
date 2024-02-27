package com.neocamp.moneytransfers.application.port.out;

import com.neocamp.moneytransfers.domain.Account;

public interface UpdateAccountPort {

    void update(Account account);
}
