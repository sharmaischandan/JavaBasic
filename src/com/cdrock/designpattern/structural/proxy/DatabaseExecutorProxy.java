package com.cdrock.designpattern.structural.proxy;

/**
 * @author Chandan Sharma
 */
public class DatabaseExecutorProxy implements DatabaseExecutor{
    boolean isAdmin;
    DatabaseExecutorImpl databaseExecutor;

    public DatabaseExecutorProxy(String name,String password){
            if (name.equals("chandan") && password.equals("1111")){
                isAdmin=true;
                databaseExecutor= new DatabaseExecutorImpl();
            }
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if (isAdmin){
            databaseExecutor.executeDatabase(query);
        }else if (query.equals("DELETE")){
            throw new Exception("DELETE not allowed for Non-Admin user !!");
        }else {
            databaseExecutor.executeDatabase(query);
        }
    }
}
