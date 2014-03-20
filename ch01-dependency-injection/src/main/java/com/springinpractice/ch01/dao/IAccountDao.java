package com.springinpractice.ch01.dao;


import com.springinpractice.ch01.model.Account;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IAccountDao {
    public List<Account> findAllAccounts() throws Exception;
}
