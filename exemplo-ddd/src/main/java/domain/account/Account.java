package domain.account;

import domain.document.NIF;

public class Account {
    private Integer accountNumber;
    private Integer branch;
    private NIF nif;

    public Account(Integer accountNumber, Integer branch) {
        this.accountNumber = accountNumber;
        this.branch = branch;
    }
}
