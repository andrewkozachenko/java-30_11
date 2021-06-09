package com.kozachenko.lesson.lesson27.forTest;

public class DoubleMockCalculator {

    //@Autowired
    private Calc calc;

    public DoubleMockCalculator() {
    }

    public DoubleMockCalculator(Calc calc) {
        this.calc = calc;
    }

    public double plus(double a, double b){
        return calc.plus(a,b);
    }
    public double minus(double a, double b){
        return calc.minus(a,b);
    }
    public double divide(double a, double b){
        return calc.divide(a, b);
    }
    public double multiply(double a, double b){
        return calc.multiply(a,b);
    }

}
