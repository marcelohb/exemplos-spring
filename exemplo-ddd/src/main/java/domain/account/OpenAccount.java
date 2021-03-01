package domain.account;

import domain.document.NIF;

public class OpenAccount {

    private NIF nif;
    private Account account;

    public OpenAccount(NIF nif, Account account) {
        this.nif = nif;
        this.account = account;
    }
}
