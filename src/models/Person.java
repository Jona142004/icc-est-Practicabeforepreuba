package models;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getname() {
        return name;
    }
    public int getage() {
        return age;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setage(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    

}