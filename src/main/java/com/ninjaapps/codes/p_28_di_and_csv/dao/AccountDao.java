package com.ninjaapps.codes.p_28_di_and_csv.dao;

import com.ninjaapps.codes.p_28_di_and_csv.model.Account;
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
