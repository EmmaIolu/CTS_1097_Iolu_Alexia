package spital.a1;

public class Main {
    public static void main(String[] args) {
        Pacient pacient =new Pacient.Builder("Ionel","23322313123").halatInterior(false).build();
        System.out.println(pacient);
    }
}
