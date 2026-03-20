package clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumiriProiecte;
    private static final int pragAcceptare = 80;
    protected static int sumaFinantare;


	public Aplicant() {
		super();
		Aplicant.sumaFinantare = 0;
	}
	public Aplicant(String nume,
                    String prenume,
                    int varsta,
                    int punctaj,
                    int nr_proiecte,
                    String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public int getPunctaj() {
        return punctaj;
    }
    public void setPunctaj(int punctaj) {this.punctaj = punctaj;}
    public int getNr_proiecte() {return numarProiecte;}
    public void setNr_proiecte(int nr_proiecte) {this.numarProiecte = nr_proiecte;}
    public String[] getDenumiriProiecte() {return denumiriProiecte;}

    public void setDenumiriProiecte(String[] denumiriProiecte) {
        this.denumiriProiecte = denumiriProiecte;
    }

    public void afisareStatusCandidat() {
        System.out.println("Aplicantul " + this.nume + " " + this.prenume +
                (this.punctaj > Aplicant.pragAcceptare ? " " : " nu ") + "a fost acceptat");
    }

    public abstract void afisareFinantare();

    protected void afisareFinantare(int sumaFinantare, String tipPersoana) {
        System.out.println(tipPersoana + " " + getNume() + " " + getPrenume() +
                " primeste" + sumaFinantare + " euro/zi in proiect.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("nume=");
        builder.append(this.nume);
        builder.append(", prenume=");
        builder.append(this.prenume);
        builder.append(", varsta=");
        builder.append(this.varsta);
        builder.append(", punctaj=");
        builder.append(this.punctaj);
        builder.append(", numarProiecte=");
        builder.append(this.numarProiecte);
        builder.append(", denumiriProiecte=");
        builder.append(Arrays.toString(this.denumiriProiecte));
        return builder.toString();
    }



}
