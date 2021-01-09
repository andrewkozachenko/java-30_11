package com.kozachenko.lesson.lesson9.exception;

public class BetterCallSaul {

    public static void main(String[] args) {
        GangException gangException = new GangException("The NY gang want to kill me");
        Saul.callToSaul().resolveGangProblem(gangException);
        LawException lawException = new LawException("The insurance problem");
        Saul.callToSaul();
        Saul.resolveProblem(lawException);
        Saul.resolveProblem(new NullPointerException("Null pointer problem"));
    }
}
