package ohtu.verkkokauppa;

public interface Bank {
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
