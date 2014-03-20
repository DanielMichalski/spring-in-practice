package com.springinpractice.ch01.dao;

import com.springinpractice.ch01.model.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author: Daniel
 */
@Component
public class CsvDao {
    @Value("${csv.fileName}")
    private String csvResource;

    public List<Account> findAllAccounts() throws Exception {
        List<Account> result = new ArrayList<Account>();

        SimpleDateFormat sdf = new SimpleDateFormat("MMddyyy");

        InputStream is = getClass()
                .getResourceAsStream("/accounts.csv");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(",");

            String accountNo = fields[0];
            BigDecimal balance = new BigDecimal(fields[1]);
            Date lastPaidOn = sdf.parse(fields[2]);

            Account account =
                    new Account(accountNo, balance, lastPaidOn);
            result.add(account);
        }

        br.close();
        return result;
    }
}
