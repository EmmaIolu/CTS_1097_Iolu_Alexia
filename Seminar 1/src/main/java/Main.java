import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Ion Popescu", 45, "P50");
        System.out.println("\nProfesor:");
        System.out.println(" - nume: " + profesor.getNume());
        System.out.println(" - varsta: " + profesor.getVarsta());
        System.out.println(" - id angajat: " + profesor.getIdAngajat());

        Asistent asistent = new Asistent("Marian Ionescu", 30, "A10");
        System.out.println("\nAsistent:");
        System.out.println(" - nume: " + asistent.getNume());
        System.out.println(" - varsta: " + asistent.getVarsta());
        System.out.println(" - id asistent: " + asistent.getIdAsistent());

        List<Student> studenti = new ArrayList<>();
        Student student1 = new Student("Andrei", 20, "S01");
        studenti.add(student1);
        Student student2 = new Student("Ana", 21, "S02");
        studenti.add(student2);
        Student student3 = new Student("Alex", 22, "S03");
        studenti.add(student3);
        System.out.println("\nStudenti creati:");
        for (Student student : studenti) {
            System.out.println(" - nume: " + student.getNume() + ", varsta: " + student.getVarsta() + ", id: " + student.getIdStudent());
        }

        Curs curs = new Curs("Calitate si Testare Software", 5, profesor, studenti);
        System.out.println("\nCurs: " + curs.getNumeCurs());
        System.out.println(" - Credite: " + curs.getCredite());
        System.out.println(" - Predat de: " + curs.getProfesor().getNume());
        System.out.println(" - Studenti inscrisi:");
        for (Student s : curs.getStudenti()) {
            System.out.println(" - - " + s.getNume());
        }

        // Dependency Inversion Principle (DIP) — „D-ul" din SOLID
        // Codul trebuie să depindă de abstracții (interfețe), nu de implementări concrete (clase)
        // Declarăm array-ul ca IPredabil[] în loc de Profesor[] sau Asistent[], astfel încât
        // dacă în viitor apare o nouă clasă (de exemplu: Invatator) care implementează IPredabil,
        // tot ce trebuie să facem este să adăugăm obiectul în array, iar codul din for rămâne neschimbat
        // În funcție de obiectul concret, metoda se comportă diferit (polimorfism)
        System.out.println("\nIPredabil:");
        IPredabil[] dascali = {profesor, asistent};
        for (IPredabil dascal : dascali) {
            System.out.print(" - ");
            dascal.preda();
        }

        // Dependency Inversion Principle (DIP) — „D-ul" din SOLID
        // Codul trebuie să depindă de abstracții (interfețe), nu de implementări concrete (clase)
        // Declarăm array-ul ca IPersoana[] în loc de Profesor[], Asistent[] sau Student[], astfel încât
        // dacă în viitor apare o nouă clasă (de exemplu: Elev) care implementează IPersoana,
        // tot ce trebuie să facem este să adăugăm obiectul în array, iar codul din for rămâne neschimbat
        System.out.println("\nIPersoana:");
        IPersoana[] persoane = {profesor, asistent, student1, student3};
        for (IPersoana persoana : persoane) {
            System.out.println(" - " + persoana.getNume() + ", varsta: " + persoana.getVarsta());
        }

        // Shallow copy
        Curs cursCopieShallow = curs;
        System.out.println("\nCopie curs shallow: " + cursCopieShallow.getNumeCurs());
        System.out.println(" - Studenti in copie shallow:");
        for (Student s : cursCopieShallow.getStudenti()) {
            System.out.println(" - - " + s.getNume());
        }

        curs.setStudenti(new ArrayList<>());
        System.out.println("\nDupa golirea studentilor din cursul original:");
        System.out.println(" - Studenti in cursul original: " + curs.getStudenti().size());
        System.out.println(" - Studenti in cursul copie shallow: " + cursCopieShallow.getStudenti().size());

        // Reinițializare curs original cu studenți (pentru exemplul următor)
        curs.setStudenti(studenti);

        // Deep copy
        Curs cursCopieDeep = new Curs(curs);
        System.out.println("\nCopie curs deep: " + cursCopieDeep.getNumeCurs());
        System.out.println(" - Studenti in copie deep:");
        for (Student s : cursCopieDeep.getStudenti()) {
            System.out.println(" - - " + s.getNume());
        }

        curs.setStudenti(new ArrayList<>());
        System.out.println("\nDupa golirea studentilor din cursul original:");
        System.out.println(" - Studenti in cursul original: " + curs.getStudenti().size());
        System.out.println(" - Studenti in cursul copie deep: " + cursCopieDeep.getStudenti().size());
    }
}
