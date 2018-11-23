package at.htl.exam01.document;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {


        Book book = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
        Book book2 = new Book("Tolkoen", "lordOfTheRings");
        Email email = new Email("Susi", "Bewerbung", "CoolCompany");

        Document[] documents = new Document[]{book, book2, email};



        int anzahlBooks = 0, anzahlEmails = 0;

        for (int i = 0; i < documents.length; i++) {
            System.out.println(documents[i].output());

            if (documents[i] instanceof Book) {
                anzahlBooks++;
            } else if (documents[i] instanceof Email) {
                anzahlEmails++;
            }

        }


        System.out.println("");
        System.out.println("Anzahl Books:  " + anzahlBooks);
        System.out.println("Anzahl Emails: " + anzahlEmails);



    }


}
