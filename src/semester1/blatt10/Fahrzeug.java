package semester1.blatt10;

/**
 * Modelliert ein Fahrzeug mit typischen Eigenschaften wie Hersteller, Modell,
 * Baujahr und Kraftstoffart. Die Klasse zeigt Kapselung durch private Attribute,
 * Getter/Setter, Konstruktoren, Enums und eine ueberschriebene toString-Methode.
 */
public class Fahrzeug {
    // Attribut - Hersteller
    private String hersteller;

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }


    // Attribut - Modell
    private String modell;

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    // Attribut - Baujahr
    private int baujahr;

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    // Attribut - Farbe
    private String farbe;

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    // Attribut - Fahrgestellnummer
    private int fahrgestellnummer;

    public int getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    // Gemeinsamer Zaehler, um jedem Fahrzeug eine eindeutige Nummer zu geben.
    private static int counter = 0;


    // Attribut - Fahrzeugtyp
    private Typen.Fahrzeugtyp fahrzeugtyp;

    public Typen.Fahrzeugtyp getFahrzeugtyp() {
        return fahrzeugtyp;
    }

    public void setFahrzeugtyp(Typen.Fahrzeugtyp fahrzeugtyp) {
        this.fahrzeugtyp = fahrzeugtyp;
    }

    // Attribut - Kraftstoffart
    private Typen.Kraftstoffart kraftstoffart;

    public Typen.Kraftstoffart getKraftstoffart() {
        return kraftstoffart;
    }

    public void setKraftstoffart(Typen.Kraftstoffart kraftstoffart) {
        this.kraftstoffart = kraftstoffart;
    }

    //----------------------------------------------------------
    // Konstruktoren
    /**
     * Erstellt ein Fahrzeug mit Standardwerten.
     */
    public Fahrzeug() {
        this.hersteller = "Unbekannt";
        this.modell = "Unbekannt";
        this.baujahr = 0;
        this.farbe = "Weiß";
        this.fahrgestellnummer = ++counter;
        this.fahrzeugtyp = Typen.Fahrzeugtyp.PKW;
        this.kraftstoffart = Typen.Kraftstoffart.BENZIN;
    }

    /**
     * Erstellt ein Fahrzeug mit allen relevanten Eigenschaften.
     */
    public Fahrzeug(String hersteller, String modell, int baujahr, String farbe, Typen.Fahrzeugtyp fahrzeugtyp, Typen.Kraftstoffart kraftstoffart) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.fahrzeugtyp = fahrzeugtyp;
        this.kraftstoffart = kraftstoffart;
        this.fahrgestellnummer = ++counter;
    }

    //------------------------------------------------------------
    /**
     * Formatiert alle Fahrzeugdaten als mehrzeiligen Text.
     */
    @Override
    public String toString() {
        return """
                Daten zum Fahrzeug:
                Hersteller: %s
                Modell: %s
                Baujahr: %s
                Farbe: %s
                Fahrgestellnummer: %s
                Fahrzeugtyp: %s
                Kraftstoffart: %s
                ----------------------------------
                """.formatted(
                hersteller,
                modell,
                baujahr,
                farbe,
                fahrgestellnummer,
                fahrzeugtyp,
                kraftstoffart
        );
    }
}
