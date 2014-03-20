package com.springinpractice.ch01;

import com.springinpractice.ch01.model.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springinpractice.ch01.service.AccountService;

import java.util.List;

/**
 * Author: Daniel
 */
public class AppLauncher {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        AccountService accountService =
                context.getBean(AccountService.class);

        List<Account> deliquentAccounts =
                accountService.findDeliquentAccounts();

        for (Account deliquentAccount : deliquentAccounts) {
            System.out.println("deliquentAccount = " + deliquentAccount);
        }
    }
}
