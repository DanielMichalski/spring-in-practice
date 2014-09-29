package com.springinpractice.ch02.service;

import com.springinpractice.ch02.dao.IJdbcAccountDao;
import com.springinpractice.ch02.model.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * Author: Daniel
 */
@Service
public class AccountService {
    private IJdbcAccountDao jdbcAccountDao;

    public List<Account> findDeliquentAccounts() throws Exception {
        ArrayList<Account> delinquentAccounts = new ArrayList<>();
        List<Account> accounts = jdbcAccountDao.findAllAccounts();

        Date thirtyDaysAgo = daysAgo(30);
        for (Account account : accounts) {
            boolean owesMoney = account.getBalance()
                    .compareTo(BigDecimal.ZERO) > 0;
            boolean thirtyDaysLate = account.getLastPaidOn()
                    .compareTo(thirtyDaysAgo) <= 0;
            if (owesMoney && thirtyDaysLate) {
                delinquentAccounts.add(account);
            }
        }

        return delinquentAccounts;
    }

    private Date daysAgo(int days) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DATE, -days);
        return gc.getTime();
    }

    public void setJdbcAccountDao(IJdbcAccountDao jdbcAccountDao) {
        this.jdbcAccountDao = jdbcAccountDao;
    }
}
