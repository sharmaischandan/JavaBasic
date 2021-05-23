package com.cdrock.designpattern.structural.proxy;

/**
 * @author Chandan Sharma
 */
public class DatabaseExecutorImpl implements DatabaseExecutor{
    @Override
    public void executeDatabase(String query) {
        System.out.println("Going to execute query !!"+query);
    }
}
