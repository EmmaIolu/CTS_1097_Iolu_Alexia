package spital.a3;

import spital.a2.model.*;
import spital.a3.model.Registrator;
import spital.a3.model.Secretar;
import spital.a3.model.TipPersonalSpitalNonMedical;

public class PersonalSpitalNonMedicalFactory implements PersonalSpitalFactory<TipPersonalSpitalNonMedical>{
    @Override
    public PersonalSpital createPersonalSpital(TipPersonalSpitalNonMedical tipPersonalSpitalNonMedical) {
        switch (tipPersonalSpitalNonMedical) {
            case SECRETAR -> { return new Secretar(); }
            case REGISTRATOR -> { return new Registrator(); }
            default -> { return () -> System.out.println("No occupation found!"); }
        }
    }
}
