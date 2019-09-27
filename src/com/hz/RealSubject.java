package com.hz;

public class RealSubject {

    public RealSubject() {

        System.out.println("Hello!");
        Ackermann ackermann = new Ackermann();
        // default max: m = 3, n = 11
        System.out.println(ackermann.calculate(3,11));
    }

    public String verifyAnswerToTheUniverseAndEveryThing() {

        return "That's the right answer!!!!!!";
    }
}
