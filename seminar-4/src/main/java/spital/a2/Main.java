package spital.a2;

import spital.a2.model.Medic;
import spital.a2.model.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory personalSpitalFactory = new PersonalSpitalSimpleFactory();

        Medic medic = (Medic) personalSpitalFactory.createPersonalSpital(TipPersonal.MEDIC);

        medic.afiseazaOcupatia();
    }
}
