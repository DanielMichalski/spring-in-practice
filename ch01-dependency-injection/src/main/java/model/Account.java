package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Author: Daniel
 */
public class Account {
    private String accountNo;
    private BigDecimal balance;
    private Date lastPaidOn;

    public Account(String accountNo, BigDecimal balance, Date lastPaidOn) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.lastPaidOn = lastPaidOn;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getLastPaidOn() {
        return lastPaidOn;
    }

    public void setLastPaidOn(Date lastPaidOn) {
        this.lastPaidOn = lastPaidOn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountNo='").append(accountNo).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", lastPaidOn=").append(lastPaidOn);
        sb.append('}');
        return sb.toString();
    }
}
