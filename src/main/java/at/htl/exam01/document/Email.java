package at.htl.exam01.document;

public class Email extends Objekte {

    String sender, betreff, empfaenger;

    public Email(String sender, String betreff, String empfaenger) {
        this.sender = sender;
        this.betreff = betreff;
        this.empfaenger = empfaenger;
    }

    @Override
    public String output() {
        String output = "Email: '" + betreff + "' von '" + sender + "' an '" + empfaenger + "'";
        return output;
    }

}
