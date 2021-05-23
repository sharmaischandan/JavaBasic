package com.cdrock.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandan Sharma
 */
public class Channel implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    public String title;

    @Override
    public void subscribe(Observer sub){
        observerList.add(sub);
    }

    @Override
    public void unSuscribe(Observer sub){
        observerList.remove(sub);
    }

    @Override
    public void notifySubscriber(){
        for (Observer su: observerList){
            su.update();
        }
    }

    @Override
    public void upload(String title){
        this.title=title;
        notifySubscriber();
    }
}
