package com.cdrock.designpattern.structural.proxy;

/**
 * @author Chandan Sharma
 */
public interface DatabaseExecutor {
    void executeDatabase(String query) throws Exception;
}
