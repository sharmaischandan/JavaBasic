package com.cdrock.designpattern.structural.proxy;

/**
 * @author Chandan Sharma
 */
public class ProxyDemoMain {
    public static void main(String[] args) throws Exception {
        DatabaseExecutorProxy databaseExecutorProxy = new DatabaseExecutorProxy("chandan","1111");
        databaseExecutorProxy.executeDatabase("DELETE");
        DatabaseExecutorProxy databaseExecutorProxy2 = new DatabaseExecutorProxy("ram","1111");
        databaseExecutorProxy2.executeDatabase("DELETE");
    }
}
