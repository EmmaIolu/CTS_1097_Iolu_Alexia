package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curs implements Cloneable {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private Asistent asistent;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.studenti = new ArrayList<>();
    }


    public Curs(String numeCurs, int credite, Profesor profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public Curs(Curs other) {
        this.numeCurs = other.numeCurs;
        this.credite = other.credite;
        this.profesor = new Profesor(other.profesor); // deep copy folosind constructorul de copiere
        this.studenti = other.studenti.stream().map(Student::new).collect(Collectors.toList()); // deep copy prin crearea unei liste noi, iar fiecărui student îi este creat un deep copy folosind constructorul de copiere
    }


    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public Profesor getProfesor() {
        return new Profesor(this.profesor);
    }

    public List<Student> getStudenti() {
        return this.studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    @Override
    public Object clone() {
        try {
            Curs cloned = (Curs) super.clone();
            cloned.profesor = this.profesor.clone();
            cloned.studenti = this.studenti.stream()
                    .map(student -> {
                        try {
                            return student.clone();
                        } catch (CloneNotSupportedException e) {
                            throw new AssertionError();
                        }
                    })
                    .collect(Collectors.toList());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
