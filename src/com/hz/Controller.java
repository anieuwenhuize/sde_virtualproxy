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

        while ( true ) {

            int i = _reader.readInt();

            switch (i) {

                case -1: say("NaN");break;

                case 1: say("easy"); break;

                case 42: say(_subject.verifyAnswerToTheUniverseAndEveryThing()); break;

                default: say("not easy man!!");
            }

        }
    }
}
