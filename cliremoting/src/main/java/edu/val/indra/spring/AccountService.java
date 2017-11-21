package edu.val.indra.spring;

import java.util.List;

public interface AccountService {

    public String insertAccount(Account account);

    public List<Account> getAccounts(String name);

}