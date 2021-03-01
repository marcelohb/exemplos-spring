package repository.account;

import domain.account.Account;
import domain.account.AccountRepository;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryList implements AccountRepository {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public void save(Account account) {
        accounts.add(account);
    }
}
