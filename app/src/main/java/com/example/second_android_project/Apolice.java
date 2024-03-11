package com.example.second_android_project;

import java.security.Policy;

public class Apolice {

    String name;
    int age;
    char sex;
    Double carValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Double getCarValue() {
        return carValue;
    }

    public void setCarValue(Double carValue) {
        this.carValue = carValue;
    }

    public Apolice(String name, int age, char sex, Double carValue){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.carValue = carValue;
    }

    public double PolicyValue(char sex, int age, double carValue){
        String sexo = Character.toString(sex);

        if((sexo.equals("m") || sexo.equals("M")) && age <= 25){
           return carValue * 10/100;
        }

        if((sexo.equals("m") || sexo.equals("M")) && age > 25){
            return carValue * 5/100;
        }

        if((sexo.equals("f") || sexo.equals("F"))){
            return carValue * 2/100;
        }

        return 0;
    }

}
