package com.cdrock.java8.defaultstaticifs;

public class TestMain extends TestMe{
    public static void main(String[] args) {
        TestMe testMe=new TestMe();
        testMe.log("chandan");
        //testMe.method1("chandan1");
        //testMe.method2("chandan2");

        //Lamda Exp
        Interface1 i1 = (s) -> System.out.println(s);

        i1.method1("LamdaExp");
    }
}
