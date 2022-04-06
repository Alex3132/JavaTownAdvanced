package Models;

import java.util.List;

public class TownHall {
    private String name_hall;
    private Mayor major;
    private List<Deputy> deputies;

    public TownHall(){

    }

    /**
     * @param name_hall
     * @param major
     * @param deputies
     */
    public TownHall(String name_hall, Mayor major, List<Deputy> deputies) {
        this.name_hall = name_hall;
        this.major = major;
        this.deputies = deputies;
    }

    public String getName_hall() {
        return name_hall;
    }

    public void setName_hall(String name_hall) {
        this.name_hall = name_hall;
    }

    public Mayor getMajor() {
        return major;
    }

    public void setMajor(Mayor major) {
        this.major = major;
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    @Override
    public String toString() {
        return "TownHall{" +
                "name_hall='" + name_hall + '\'' +
                ", major=" + major +
                ", deputies=" + deputies +
                '}';
    }
}
