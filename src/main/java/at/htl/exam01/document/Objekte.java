package at.htl.exam01.document;

public abstract class Objekte {

    static Buch buch = new Buch("Rowlings", "Harry Potter und der Stein der Weisen");
    static Buch buch2 = new Buch("Tolkoen", "lordOfTheRings");
    static Email email = new Email("Susi", "Bewerbung", "CoolCompany");

    static Objekte[] objektes = new Objekte[]{buch, buch2, email};

    public abstract String output();

}
