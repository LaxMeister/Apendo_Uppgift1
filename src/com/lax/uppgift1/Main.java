package com.lax.uppgift1;

import java.util.Scanner;

public class Main {

    /*
     _   _                   _  __ _     __
    | | | |                 (_)/ _| |   /  |
    | | | |_ __  _ __   __ _ _| |_| |_  `| |
    | | | | '_ \| '_ \ / _` | |  _| __|  | |
    | |_| | |_) | |_) | (_| | | | | |_  _| |_
     \___/| .__/| .__/ \__, |_|_|  \__| \___/
          | |   | |     __/ |
          |_|   |_|    |___/
    */

    /**
     * Det här programmet fungerar som så att du kommer att få 5 frågor.
     * först får du fyra frågor i rad som du ska svara på.
     * första frågan är om vilket startnummer du vill ha i din talserie.
     * andra frågan är om vilket slutnummer du vill ha i din talserie.
     * tredje frågan är hur stor steglängden ska vara i din talserie.
     * fjärde frågan är om du vill ha med en multipel eller inte i din talserie.
     *
     * Efter ha svarat på dom fyra frågorna kommer programmet ta svaren som är lagrade
     * i olika variaber och skicka in dom i logikklassen och köra funktionen som skapar
     * talserien. Beroende på vad du har svarat i frågorna så kommer funktionen
     * agera olika utifrån villkoren i funktionen.  Som exempel:
     *
     * Om du har svarat med ett högt startnummer på exempelvis 10 och ett lågslutvärde på exempelvis 1
     * med steglängd på exempelvis 2 och ingen multipel så kommer  du få resulatet
     * en talserie som ser ut så här: [10 8 6 4 2].
     *
     * Har du däremot svarat att du har en multipel så kommer du få ordet Apendo i talserien där numret i serien
     * är delbart med nummret som du satte som multipel. Som exempel:
     *
     * startnummer är 5, slutnummer är 15, stegländ är 3 och multipel är 4 så kommer
     * talserien i resultatet se ut så här: [5, Apendo!, 11, 14]
     *
     * Den femte frågan kommer när funktionen har skapat talserien. Frågan är hur du vill ha resultatet presenterat.
     * Du kommer få 2st alternativ, alternativ R eller alternativ A.
     *
     * Alternativ R står för Regular och då får du resultatet presenterat som i exmplen ovanför.
     * Alternativ A står för Advance och då får du resultatet presenterat lite mer avancerat.
     *
     * Resultatet i Advance presenterar talserien som i regular men även siffran i index av talserien och
     * hur många gånger ordet Apendo har skrivits ut.
     *
     * För att förtydliga vad jag menar med "siffran i index av talserien" så menar jag så här:
     * Siffran som sätts i stegländen avgör vilken position i talserien vi ska hämta siffran i talserien.
     * Som exempel om du har en stegländ på 2 och fått resultatet [10 8 6 4 2}
     * så kommer siffran som hämtades från position 2 i talserien att vara 8.
     *
     *  När du har fått resultatet så stängs programmet av.
     *
     */

    public static void main(String[] args) {
      /** Deklaration av variabler **/
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        String choice ="";
        boolean choiceMade = false;

        /** Initiera input avläsning i konsolen **/
        Scanner input = new Scanner(System.in);

        /** Interface med input **/
        System.out.println("type a starting number for number range");
        num1 = input.nextInt();

        System.out.println("type a ending number for number range");
        num2 = input.nextInt();

        System.out.println("type a number for how many steps in the range");
        num3 = input.nextInt();

        System.out.println("type a number for a multiple (if not just type 0)");
        num4 = input.nextInt();

        /** initiera logikklassen med variablerna som argument **/
        NumbersInRange numbersInRange = new NumbersInRange(num1, num2, num3, num4);

        /** Har en while-loop här för att tvinga användare att göra ett val **/
        while (!choiceMade ) {
            System.out.println("Do you want to see the result? (Press R for regular results or Press A for advanced results");
            choice = input.next();

            /** Vid val R så ropar vi på funktionen i logikklassen och får resultat utifrån Del A och Del B i uppgiften**/
            if (choice.equals("R")) {
                System.out.println(numbersInRange.NumbersInRangeFunction());
                choiceMade = true;
            }
            /**  Vid val A så ropar vi på funktionen i logikklassen och får resultat utifrån Del A ,B och C i uppgiften**/
            if (choice.equals("A")) {
                System.out.println(numbersInRange.NumbersInRangeFunction() + "\n" + numbersInRange.AdvancedResults());
                choiceMade = true;
            }
        }
    }


}
