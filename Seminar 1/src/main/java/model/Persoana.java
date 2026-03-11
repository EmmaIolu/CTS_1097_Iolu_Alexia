package model;

public class Persoana implements IPersoana {

    private String nume;
    private int varsta;

    public Persoana() {
        this.nume = "Anonim";
        this.varsta = 0;
    }

    public Persoana(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public Persoana(Persoana altaPersoana) {
        this.nume = altaPersoana.nume;
        this.varsta = altaPersoana.varsta;
    }


    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }
}
