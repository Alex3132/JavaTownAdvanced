package Models;


import Enums.PublicFunctionsType;
import Enums.SexEnumType;



public class Deputy extends Person{

    private PublicFunctionsType job;



    public Deputy(){

    }

    public Deputy(String name, int age, SexEnumType sex, PublicFunctionsType job) {
        super(name, age, sex);
        this.job = job;
    }

    public PublicFunctionsType getJob() {
        return job;
    }

    public void setJob(PublicFunctionsType job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                ", job=" + job +
                '}';
    }
}
