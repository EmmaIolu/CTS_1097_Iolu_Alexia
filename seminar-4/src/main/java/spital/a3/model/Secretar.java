package spital.a3.model;

import spital.a2.model.PersonalSpital;

public class Secretar implements PersonalSpital {
    @Override
    public void afiseazaOcupatia() {
        System.out.println("Secretar");
    }
}