package domain.account;

public class CloseAccount {

    private Integer accountNumber;
    private Integer branch;

    public CloseAccount(Integer accountNumber, Integer branch) {
        this.accountNumber = accountNumber;
        this.branch = branch;
    }

    public void close() {
        // TODO
    }
}
