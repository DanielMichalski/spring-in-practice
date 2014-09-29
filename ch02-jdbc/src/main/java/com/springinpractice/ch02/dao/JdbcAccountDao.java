package com.springinpractice.ch02.dao;

import com.springinpractice.ch02.model.Account;
import org.apache.commons.dbcp.BasicDataSource;

import java.util.List;

/**
 * Author: Daniel
 */
public class JdbcAccountDao implements IJdbcAccountDao {
    private BasicDataSource dataSource;

    @Override
    public List<Account> findAllAccounts() throws Exception {
        //TODO
        return null;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
