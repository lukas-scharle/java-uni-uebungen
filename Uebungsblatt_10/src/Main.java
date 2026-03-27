//TIP Zum <b>Ausführen</b> des Codes <shortcut actionId="Run"/> drücken oder
// Klicke auf das Symbol <icon src="AllIcons.Actions.Execute"/> in der Randleiste.
public class Main {
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