package spital.a2;

import spital.a2.model.PersonalSpital;
import spital.a2.model.TipPersonal;

public interface PersonalSpitalFactory {
    PersonalSpital createPersonalSpital(TipPersonal tipPersonal);
}
