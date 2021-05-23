package com.cdrock.designpattern.behavioral.observer;

/**
 * @author Chandan Sharma
 * The observer pattern is a software design pattern in which an object,
 * named the subject, maintains a list of its dependents, called observers,
 * and notifies them automatically of any state changes, usually by calling one of their methods
 */
public class YouTubeDemo {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Observer s1 = new Subscriber("Chandan");
        Observer s2 = new Subscriber("Kamini");
        Observer s3 = new Subscriber("Ram");
        Observer s4 = new Subscriber("Lakhman");
        Observer s5 = new Subscriber("Sita");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);

        channel.unSuscribe(s4);

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);

        channel.upload("Java love!!!");
    }
}
