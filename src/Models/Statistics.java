package Models;

public class Statistics {
    private int nb_inhabitants;
    private int postal_code;

    public Statistics(){

    }

    /**
     * @param nb_inhabitants
     * @param postal_code
     */
    public Statistics(int nb_inhabitants, int postal_code) {
        this.nb_inhabitants = nb_inhabitants;
        this.postal_code = postal_code;
    }

    public int getNb_inhabitants() {
        return nb_inhabitants;
    }

    public void setNb_inhabitants(int nb_inhabitants) {
        this.nb_inhabitants = nb_inhabitants;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "nb_inhabitants=" + nb_inhabitants +
                ", postal_code=" + postal_code +
                '}';
    }
}
