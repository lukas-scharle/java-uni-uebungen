package semester1.blatt10;

/**
 * Einfache Personenklasse zur Einfuehrung in objektorientierte Programmierung.
 * Sie zeigt Attribute, Zugriffsmethoden, Konstruktoren und eine Methode, die
 * den Zustand eines Objekts veraendert.
 */
public class Person {
    // ATTRIBUTE
    // name
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // alter
    private int alter;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    // Geschlecht
    private char geschlecht;

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }


    // Adresse
    private String textbfAdresse;

    public String getTextbfAdresse() {
        return textbfAdresse;
    }

    public void setTextbfAdresse(String textbfAdresse) {
        this.textbfAdresse = textbfAdresse;
    }


    //-------------------------------------------------
    // KONSTRUKTOREN
    /**
     * Erstellt eine Person mit vollstaendig uebergebenen Daten.
     */
    public Person(String name, int alter, char geschlecht, String textbfAdresse) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.textbfAdresse = textbfAdresse;
    }

    /**
     * Erstellt eine Person mit neutralen Standardwerten.
     */
    public Person() {
        this.name = "Unbekannt";
        this.alter = 0;
        this.geschlecht = '?';
        this.textbfAdresse = "Unbekannt";
    }

    //--------------------------------------------------
    /**
     * Erhoeht das Alter um ein Jahr und demonstriert Zustandsaenderung.
     */
    public void geburtstag() {
        int neuesAlter = this.getAlter() + 1;
        this.setAlter(neuesAlter);
    }

    /**
     * Gibt die Personendaten strukturiert auf der Konsole aus.
     */
    public void toStringPerson(){
        System.out.println("Daten zur semester1.blatt10.Person:");
        System.out.println("Name: " + this.getName());
        System.out.println("Alter: " + this.getAlter());
        System.out.println("Geschlecht: " + this.getGeschlecht());
        System.out.println("Adresse: " + this.getTextbfAdresse());
        System.out.println("----------------------------------------");
    }
}
