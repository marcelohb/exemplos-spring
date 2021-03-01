package domain.account;

import domain.account.Account;

public class AccountFactory {

    public Account create() {
        return new Account(1,1);
    }
}
