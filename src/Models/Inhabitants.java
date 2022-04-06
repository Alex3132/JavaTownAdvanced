package Models;


public class Inhabitants {
    private String demonym;


    public Inhabitants(){

    }

    /**
     * @param demonym
     */
    public Inhabitants(String demonym) {
        this.demonym = demonym;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    @Override
    public String toString() {
        return "Inhabitants{" +
                "demonym='" + demonym + '\'' +
                '}';
    }
}
