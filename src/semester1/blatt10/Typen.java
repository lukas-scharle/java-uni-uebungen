package semester1.blatt10;

/**
 * Sammelt Enums fuer Fahrzeugdaten. Dadurch koennen feste Wertemengen wie
 * Fahrzeugtyp und Kraftstoffart typsicher verwendet werden.
 */
public class Typen {
    /**
     * Moegliche Fahrzeugkategorien.
     */
    public enum Fahrzeugtyp {
        PKW,
        LKW,
        MOTORRAD,
        BUS,
        VAN
    }

    /**
     * Moegliche Kraftstoff- bzw. Antriebsarten.
     */
    public enum Kraftstoffart {
        BENZIN,
        DIESEL,
        ELEKTRISCH,
        HYBRID,
        GAS
    }
}
