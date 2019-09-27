package com.hz;

public class Controller {

    private IntWrapper _reader;
    private RealSubject _subject;

    public Controller(IntWrapper reader, RealSubject subject) {
        this._reader = reader;
        this._subject = subject;
    }

    private void say(String msg) {
        System.out.println(msg);
    }

    public void start() {

        say("Quess the answer to life the universe and everything.");

        while ( true ) {

            int i = _reader.readInt();

            switch (i) {

                case -1: say("NaN");break;

                case 1: say("to easy man."); break;

                case 42: say(_subject.verifyAnswerToTheUniverseAndEveryThing()); break;

                default: say(_subject.verifyOtherNumber());
            }

        }
    }
}
