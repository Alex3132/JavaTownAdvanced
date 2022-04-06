package Models;

import Enums.PublicFunctionsType;
import Enums.SexEnumType;

public class Mayor extends Person{
    private PublicFunctionsType job;

    public Mayor(){

    }

    /**
     * @param name
     * @param age
     * @param job
     */

    public Mayor(String name, int age, SexEnumType sex, PublicFunctionsType job) {
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
        return "Mayor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                ", job=" + job +
                '}';
    }
}
