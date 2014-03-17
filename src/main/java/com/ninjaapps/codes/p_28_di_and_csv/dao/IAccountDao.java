package com.ninjaapps.codes.p_28_di_and_csv.dao;

import com.ninjaapps.codes.p_28_di_and_csv.model.Account;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IAccountDao {
    public List<Account> findAllAccounts() throws Exception;
}
