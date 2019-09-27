package com.hz;

public class RealSubject {

    public RealSubject() {

        System.out.println("Hello!");
        Ackermann ackermann = new Ackermann();
        // default max: m = 3, n = 11
        System.out.println(ackermann.ccalc(2,800));
    }

    public String verifyAnswerToTheUniverseAndEveryThing() {

        return "That's the right answer!!!!!!";
    }
}
