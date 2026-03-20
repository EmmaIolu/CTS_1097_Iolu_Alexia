package spital.a3;

import spital.a2.model.TipPersonal;
import spital.a3.model.TipPersonalSpitalNonMedical;

public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory<TipPersonal> personalSpitalFactory = new PersonalSpitalMedicalFactory();

        personalSpitalFactory.createPersonalSpital(TipPersonal.MEDIC).afiseazaOcupatia();

        PersonalSpitalFactory<TipPersonalSpitalNonMedical> personalSpitalNonMedicalPersonalSpitalFactory = new PersonalSpitalNonMedicalFactory();

        personalSpitalNonMedicalPersonalSpitalFactory.createPersonalSpital(TipPersonalSpitalNonMedical.SECRETAR).afiseazaOcupatia();
    }
}
