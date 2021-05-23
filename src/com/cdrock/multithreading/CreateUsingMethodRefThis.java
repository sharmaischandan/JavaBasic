package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class CreateUsingMethodRefThis {
    public void runBody(){
        for (int i=0;i<5;i++){
            System.out.println("Test thread using method ref");
        }
    }
    public static void main(String[] args) {
        CreateUsingMethodRefThis cu= new CreateUsingMethodRefThis();
        cu.createThread();
    }

    //using this keyword
    private void createThread() {
        new Thread(this::runBody).start();
    }

}
