package com.ninjaapps.codes.p_28_di_and_csv;

import com.ninjaapps.codes.p_28_di_and_csv.model.Account;
import com.ninjaapps.codes.p_28_di_and_csv.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author: Daniel
 */
public class AppLauncher {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("p_28_di_and_csv/context.xml");

        AccountService accountService =
                context.getBean(AccountService.class);

        List<Account> deliquentAccounts =
                accountService.findDeliquentAccounts();

        for (Account deliquentAccount : deliquentAccounts) {
            System.out.println("deliquentAccount = " + deliquentAccount);
        }
    }
}
