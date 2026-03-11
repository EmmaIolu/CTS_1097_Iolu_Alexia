package model;

public class Student extends Persoana implements Cloneable{

    private String idStudent;

    public Student( String nume, int varsta, String idStudent) {
        super(varsta, nume);
        this.idStudent = idStudent;
    }


    public Student(Student altStudent) {
        super(altStudent);
        this.idStudent = altStudent.idStudent;
    }


    public String getIdStudent() {
        return idStudent;
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
