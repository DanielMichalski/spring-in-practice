package com.springinpractice.ch02.dao;

import com.springinpractice.ch02.model.Account;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IJdbcAccountDao {
    public List<Account> findAllAccounts() throws Exception;
}
