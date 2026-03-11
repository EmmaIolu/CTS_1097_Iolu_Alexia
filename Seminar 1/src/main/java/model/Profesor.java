package model;

public class Profesor extends Persoana implements IPredabil,Cloneable{
    private String idAngajat;

    public Profesor( String nume,int varsta, String idAngajat) {
        super(varsta, nume);
        this.idAngajat = idAngajat;
    }


    public Profesor(Profesor altProfesor) {
        super(altProfesor);
        this.idAngajat = altProfesor.idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    @Override
    public void preda() {
        System.out.printf("%s preda ca profesor.",this.getNume());
    }

    @Override
    public Profesor clone() throws CloneNotSupportedException {
        return (Profesor) super.clone();
    }
}
