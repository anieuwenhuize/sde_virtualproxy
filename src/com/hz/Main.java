package com.hz;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) {

        IntWrapper intReader = new IntWrapper(
                new ConsoleReader());

        RealSubject masterThing = new RealSubject();

        Controller contr = new Controller(intReader, masterThing);

        contr.start();
    }
}
