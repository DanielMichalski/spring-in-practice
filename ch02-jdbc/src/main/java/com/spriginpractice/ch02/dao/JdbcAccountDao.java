package com.spriginpractice.ch02.dao;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * Author: Daniel
 */
public class JdbcAccountDao {
    private BasicDataSource dataSource;

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
