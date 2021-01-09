package com.kozachenko.lesson.lesson8;

public class Watch {

    private String type;
    private String color;
    private String vendor;
    private String mark;
    private String model;

    public Watch() {
        System.out.println("Watch without parameters");
    }

    public Watch(String type) {
        this.type = type;
        System.out.println("Watch with parameter type");
    }

    public Watch(String vendor, String mark, String model) {
        this.vendor = vendor;
        this.mark = mark;
        this.model = model;
        System.out.println("Watch with parameters vendor, mark, model");
    }

    public Watch(String mark, String model) {
        this(null, mark, model);
        System.out.println("Watch with parameters mark, model");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "[" + this.vendor + ", " +
                this.mark + ", " +
                this.model + "]";
    }
}
