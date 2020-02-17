package com.ustatunja.entity;

public class Pig {

    private final String BREED = "Cerdo criollo";
    private double weight;
    private int  age;

    public Pig() {
    }

    public Pig(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}

