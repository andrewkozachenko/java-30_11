package com.kozachenko.lesson.lesson11;

public class Lesson11Main {
    public static void main(String[] args) {
//        nestedClassMeme();
//        localClassDoctor();
        staticNestedClass();
    }

    private static void staticNestedClass(){
        double massa = 72.00;
        double e = massa * Math.pow(Constants.Physic.C, 2);
        System.out.println(" E = m c^2 = " + e);
    }
    private static void localClassDoctor(){
        Doctor doctor = new Doctor();
//        doctor.makeInjection("SulfidNatrum");
        Injector injector = new Injector() {
            @Override
            public String injectionResult(Doctor doctor) {
                doctor.makeInjection("Sugar");
                return "Done";
            }
        };
        injector.injectionResult(doctor);
    }

    private static void nestedClassMeme() {
        Meme meme = new Meme();
        Meme.Joke joke = meme.new Joke();
        joke.setJoke("FFF");
        meme.setJoke(joke);
        meme.showMeme();
    }
}
