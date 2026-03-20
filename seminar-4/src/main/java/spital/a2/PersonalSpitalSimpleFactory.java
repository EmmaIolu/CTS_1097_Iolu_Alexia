package spital.a2;

import spital.a2.model.*;

public class PersonalSpitalSimpleFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital createPersonalSpital(TipPersonal tipPersonal) {
        switch (tipPersonal) {
            case MEDIC -> { return new Medic(); }
            case ASISTENT -> { return new Asistent(); }
            case BANCARDIER -> { return new Brancardier(); }
            default -> {return () -> System.out.println("No occupation found!"); }
        }
    }
}
