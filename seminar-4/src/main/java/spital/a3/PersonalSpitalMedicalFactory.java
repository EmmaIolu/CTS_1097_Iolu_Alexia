package spital.a3;

import spital.a2.model.*;

public class PersonalSpitalMedicalFactory implements PersonalSpitalFactory<TipPersonal>{
    @Override
    public PersonalSpital createPersonalSpital(TipPersonal tipPersonalSpital) {
        switch (tipPersonalSpital) {
            case MEDIC -> { return new Medic(); }
            case ASISTENT -> { return new Asistent(); }
            case BANCARDIER -> { return new Brancardier(); }
            default -> { return () -> System.out.println("No occupation found!"); }
        }
    }
}
