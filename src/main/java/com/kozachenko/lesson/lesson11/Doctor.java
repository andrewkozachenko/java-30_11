package com.kozachenko.lesson.lesson11;

class Liquid{
    String name;

    public String getLiquidName(){
        return name;
    }
}

interface Injector{
    String injectionResult(Doctor doctor);
}

public class Doctor {

    public void makeInjection(String injectionName){
        class Drug {
            public String name;
            public Liquid liquid;
        }
        Liquid liquid = new Liquid(){
            public String getLiquidName(){
                return name + " " + getSupperName();
            }

            private String getSupperName(){
                return "Supper";
            }
        };
        Drug drug = new Drug();
        drug.liquid = liquid;
        drug.liquid.name = "NNNN";
        drug.name = injectionName;
        System.out.println("The injection " + drug.name+" " + drug.liquid.getLiquidName() + " was done");
    }

}
