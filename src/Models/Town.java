package Models;

import java.util.List;

public class Town {
    private String id;
    private String Name;
    private List<Statistics> stat;
    private List<TownHall> townHall;
    private List<Districts> districts;
    private Inhabitants inhabitant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Statistics> getStat() {
        return stat;
    }

    public void setStat(List<Statistics> stat) {
        this.stat = stat;
    }

    public List<TownHall> getTownHall() {
        return townHall;
    }

    public void setTownHall(List<TownHall> townHall) {
        this.townHall = townHall;
    }

    public List<Districts> getDistricts() {
        return districts;
    }

    public void setDistricts(List<Districts> districts) {
        this.districts = districts;
    }

    public Inhabitants getInhabitant() {
        return inhabitant;
    }

    public void setInhabitant(Inhabitants inhabitant) {
        this.inhabitant = inhabitant;
    }

    @Override
    public String toString() {
        return "Town{" +
                "id='" + id + '\n' +
                "Name='" + Name + '\n' +
                "stat=" + stat + '\n' +
                "townHall=" + townHall + '\n' +
                "districts=" + districts + '\n' +
                "inhabitant=" + inhabitant + '\n' +
                '}';
    }
}
