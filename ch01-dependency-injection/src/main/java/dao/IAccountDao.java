package dao;


import model.Account;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IAccountDao {
    public List<Account> findAllAccounts() throws Exception;
}
