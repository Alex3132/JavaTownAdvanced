package Models;

import Enums.SexEnumType;

public class Person {
    private String name;
    private int age;
    private SexEnumType sex;

    public Person() {

    }

    public Person(String name, int age, SexEnumType sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public SexEnumType getSex() {
        return sex;
    }

    public void setSex(SexEnumType sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
