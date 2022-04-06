package Models;

import Enums.Tourist;



public class Districts {
    private String id;
    private String name;
    private Tourist tourist;

    public Districts(){

    }

    /**
     * @param id
     * @param name
     * @param tourist
     */
    public Districts(String id, String name, Tourist tourist) {
        this.id = id;
        this.name = name;
        this.tourist = tourist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    @Override
    public String toString() {
        return "Districts{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tourist=" + tourist +
                '}';
    }
}
