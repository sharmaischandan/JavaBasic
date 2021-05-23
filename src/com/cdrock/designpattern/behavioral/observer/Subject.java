package com.cdrock.designpattern.behavioral.observer;

/**
 * @author Chandan Sharma
 */
public interface Subject {

    void subscribe(Observer sub);

    void unSuscribe(Observer sub);

    void notifySubscriber();

    void upload(String title);
}
