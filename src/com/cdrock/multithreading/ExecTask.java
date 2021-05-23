package com.cdrock.multithreading;

import java.util.concurrent.Callable;

public class ExecTask implements Callable {

    String mess;
    public String call(){
        return "Hello "+mess;
    }

    public ExecTask(String hello_executer) {
        this.mess=hello_executer;
    }
}
