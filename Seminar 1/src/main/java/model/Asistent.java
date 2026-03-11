package model;

public class Asistent extends Persoana implements IPredabil {

    private String idAsistent;

    public Asistent() {
        super();
        this.idAsistent = "A00";
    }

    public Asistent(String nume,int varsta, String idStudent) {
        super(varsta, nume);
        this.idAsistent = idStudent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.printf("%s preda ca asistent.",this.getNume());
    }
}
