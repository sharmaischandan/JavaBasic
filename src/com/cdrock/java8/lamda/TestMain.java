package com.cdrock.java8.lamda;

public class TestMain {
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        DrawebleIfs d=new DrawebleIfs(){
            public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();

        //No Parameter Syntax
        DrawebleIfs drawebleIfs=()->{
            System.out.println("Drawing=="+width);
        };
        drawebleIfs.draw();

        //Java Lambda Expression Example: No Parameter
        SayInterface s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());

        //Java Lambda Expression Example: Single Parameter
        // Lambda expression with single parameter.
        SayableInterface s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        SayableInterface s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("Sonoo"));

        // You can pass multiple statements in lambda expression
        SayableInterface person = (message)-> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));

        // Multiple parameters in lambda expression
        MultiParaInterface ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        MultiParaInterface ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));


        // Lambda expression without return keyword.
        MultiParaInterface ad11=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Lambda expression with return keyword.
        MultiParaInterface ad22=(int a,int b)->{
            return (a+b);
        };
        System.out.println(ad2.add(100,200));
    }

}
