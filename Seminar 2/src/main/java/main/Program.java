package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Angajat;
import clase.Aplicant;
import clase.Utils;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		}

        for(Aplicant aplicant : listaAngajati) {
            System.out.println(aplicant);
            aplicant.afisareStatusCandidat();
        }
	}

}
