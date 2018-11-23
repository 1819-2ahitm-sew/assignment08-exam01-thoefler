package at.htl.exam01.compress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {



        StringCompress sc = new StringCompress();

        int count = sc.getNoOfLines(FILE_NAME);

        String[] text = sc.readFromFile(FILE_NAME, count);


        print(text);

    }







    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A

     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName, int count) {

        String[] lines = new String[count];
        int i = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {

            while (scanner.hasNextLine()) {

                lines[i] = scanner.nextLine();

                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char letter = ' ';
        int number = 0;
        String uncompressed[] = new String[count];


        for (int j = 0; j < lines.length; j++) {

            String line = "";

            letter = lines[j].charAt(0);
            number = Integer.parseInt(lines[j].substring(1));


            for (int k = 0; k < number; k++) {
                line = letter + line;
            }



            uncompressed[j] = line;

        }

            for (int k = 0; k < count; k++) {
                lines[k] = uncompressed[k];
            }


        return lines;
    }







    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public static void print(String[] lines) {

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }

    }







    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public int getNoOfLines(String fileName) {

        int count = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {

            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return count;
    }
}
