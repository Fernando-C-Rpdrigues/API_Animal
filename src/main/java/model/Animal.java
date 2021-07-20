package model;

public class Animal {

    private String name;
    private int age;
    private int numberPaws;

    public Animal(String name, int age, int numberPaws) {
        this.name = name;
        this.age = age;
        this.numberPaws = numberPaws;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

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

    public int getNumberPaws() {
        return numberPaws;
    }

    public void setNumberPaws(int numberPaws) {
        this.numberPaws = numberPaws;
    }


    @Override
    public String toString() {
        return  "\nNome=" + name
                +"\nIdade = " + age
                + "\nQuantidade de patas = " + numberPaws;
    }
}