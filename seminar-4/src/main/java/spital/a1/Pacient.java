package spital.a1;

public class Pacient {

    private String nume;
    private String cnp;
    //extra optiuni
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;


    //builder pattern
    //mandatory fields (cnp,nume)
    private Pacient(String cnp, String nume) {
        this.cnp = cnp;
        this.nume = nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }
    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }
    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }
    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    public static class Builder {

        private final Pacient pacient;

        public Builder(String nume, String cnp) {
            pacient = new Pacient(nume, cnp);
        }

        public Builder patRabatabil(boolean val) {
            pacient.patRabatabil = val;
            return this;
        }

        public Builder micDejunInclus(boolean val) {
            pacient.micDejunInclus = val;
            return this;
        }

        public Builder papuciCamera(boolean val) {
            pacient.papuciCamera = val;
            return this;
        }

        public Builder halatInterior(boolean val) {
            pacient.halatInterior = val;
            return this;
        }

        public Pacient build() {
            return pacient;
        }
    }

}
