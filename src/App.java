public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        System.out.println("");

        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         */
        Wizard Voldemort = new Wizard("Voldemort", 1, 100, 200);
         /**
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         */
        Warlock Atlantes = new Warlock("Atlantes", 1, 100, 200);

        /**
         * Displaying Character Details
         */
        Voldemort.displayName();
        Voldemort.displayDetails();
        System.out.println("");
        Atlantes.displayName();
        Atlantes.displayDetails();
        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */
        /**
         * First Round
         */
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Let the Battle begins!");
        /**
         * Casting Spells
         */
        System.out.println("");
        System.out.println("Round 1, FIGHT!");
        Atlantes.bladeWard(Voldemort, Atlantes);
        Voldemort.dancingLights(Atlantes, Voldemort);
        /**
         * Displaying current character details
         */
        System.out.println("");
        Voldemort.displayDetails();
        System.out.println("");
        Atlantes.displayDetails();
        /**
         * Second Round
         */
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Round 2, FIGHT!");
        Voldemort.thunderClap(Atlantes, Voldemort);
        Atlantes.Absorption(Voldemort, Atlantes);
        /**
         * Displaying current character details
         */
        System.out.println("");
        Voldemort.displayDetails();
        System.out.println("");
        Atlantes.displayDetails();
        System.out.println("");
        Atlantes.heal();

        /**
         * Third Round, Final blow
         */
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Round 3, FIGHT!");
        Atlantes.bladeWard(Voldemort, Atlantes);
        System.out.println("");
        Voldemort.displayDetails();
        System.out.println("");
        Atlantes.displayDetails();
    }
}
