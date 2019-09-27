package com.hz;

public class Surrogate implements ICanCalculateTheAnswer {

    private RealSubject _subject;

    @Override
    public String verifyAnswerToTheUniverseAndEveryThing() {

        if(_subject == null) {

            _subject = new RealSubject();
        }

        return _subject.verifyAnswerToTheUniverseAndEveryThing();
    }

    @Override
    public String verifyOtherNumber() {
        return "Not the right number...";
    }
}
