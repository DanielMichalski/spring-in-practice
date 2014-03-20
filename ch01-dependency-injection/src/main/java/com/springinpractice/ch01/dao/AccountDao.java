package com.springinpractice.ch01.dao;

import com.springinpractice.ch01.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Daniel
 */
@Repository
public class AccountDao implements IAccountDao {
    @Autowired
    private CsvDao csvDao;

    @Override
    public List<Account> findAllAccounts()
            throws Exception {
        return csvDao.findAllAccounts();
    }
}
