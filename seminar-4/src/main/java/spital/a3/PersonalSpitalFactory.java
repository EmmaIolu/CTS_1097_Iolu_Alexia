package spital.a3;

import spital.a2.model.PersonalSpital;
import spital.a3.model.TipPersonalSpital;

public interface PersonalSpitalFactory<T extends TipPersonalSpital> {
    PersonalSpital createPersonalSpital(T tipPersonalSpital);
}
