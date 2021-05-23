package com.cdrock.designpattern.behavioral.observer;

/**
 * @author Chandan Sharma
 */
public class Subscriber implements Observer {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
            System.out.println("Hey "+name+" Video updated -"+channel.title);
    }

    @Override
    public void subscribeChannel(Channel channel){
        this.channel=channel;
    }

}
