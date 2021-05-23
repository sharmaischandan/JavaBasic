package com.cdrock.designpattern.behavioral.observer;

/**
 * @author Chandan Sharma
 */
public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
