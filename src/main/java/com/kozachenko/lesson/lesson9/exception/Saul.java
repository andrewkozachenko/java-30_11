package com.kozachenko.lesson.lesson9.exception;

public class Saul implements Lawyer, Cleaner {

    private static final Saul SAUL = new Saul();

    private Saul(){}

    public static Saul callToSaul(){
        return SAUL;
    }

    public static void resolveProblem(Exception problem){
        try{
            throw problem;
        } catch (LawException lawException){
            SAUL.resolveLawProblem(lawException);
        } catch (GangException gangException){
            SAUL.resolveGangProblem(gangException);
        } catch (Exception exception){
            System.out.println("I couldn't help you with it\n" + exception.getMessage()+"\n And leave the country!");
        }


    }

    @Override
    public void resolveGangProblem(GangException gangException) {
        System.out.println("I can resolve \t" + gangException.getMessage() +"\t for 10 000$" );
    }

    @Override
    public void resolveLawProblem(LawException lawException) {
        System.out.println("I can resolve \t" + lawException.getMessage() +"\t for 3 000$" );
    }
}
