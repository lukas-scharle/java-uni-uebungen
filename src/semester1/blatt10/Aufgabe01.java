package semester1.blatt10;

/**
 * Demonstriert die Arbeit mit eigenen Klassen, Objekten und Konstruktoren. Es
 * werden Personen- und Fahrzeugobjekte erzeugt, Methoden aufgerufen und die
 * Objektinformationen ausgegeben.
 */
public class Aufgabe01 {
    /**
     * Erstellt Beispielobjekte fuer die OOP-Aufgaben des Uebungsblatts.
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.toStringPerson();
        p1.geburtstag();
        p1.toStringPerson();

        Fahrzeug f1 = new Fahrzeug();
        Fahrzeug f2 = new Fahrzeug();
        Fahrzeug f3 = new Fahrzeug();
        Fahrzeug f4 = new Fahrzeug();
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f4);
    }
}
