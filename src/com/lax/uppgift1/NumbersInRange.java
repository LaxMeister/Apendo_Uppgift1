package com.lax.uppgift1;

import java.util.ArrayList;
import java.util.List;

public class NumbersInRange {

    /** Logikklass där all logik genomförs. **/

    /**
     * Deklaration av variabler
     **/
    public int start;
    public int end;
    public int stepNum;
    public int multiple;
    public List result = new ArrayList<>();
    public int count = 0;

    /**
     * Konstruktor för klassen som har argumenten:
     * start = startvärde
     * end = slutvärde
     * stepNum = Steglängd och vilket index som skulle hämtas i del C
     * multiple = Multipel av heltalet
     **/
    public NumbersInRange(int start, int end, int stepNum, int multiple) {
        this.start = start;
        this.end = end;
        this.stepNum = stepNum;
        this.multiple = multiple;
    }

    /**
     * Funktionen som skapar talserier
     **/
    public List NumbersInRangeFunction() {

        /** Om startvärdet är större än slutvärdet och steglängden är större än eller likamed 1 **/
        if (start > end && stepNum >= 1) {
            /** Om multipel av heltalet är lika med 0 så loopa igenom och lägg till i listan.**/
            if (multiple <= 0) {
                /** Antal varv loopen ska snurra bestäms av startvärdet i detta fall så är startvärdet högre än
                 * slutvärdet och minskas för varje varv**/
                for (int i = start; i > end - 1; i = i - stepNum) {
                    result.add(i);
                }
            } else {
                /** Antal varv loopen ska snurra bestäms av startvärdet i detta fall så är startvärdet högre än
                 * slutvärdet och minskas för varje varv**/
                for (int i = start; i > end - 1; i = i - stepNum) {
                    /** Om i vårat startvärdet är en multipel av variabeln multiple så lägg till ordet apendo istället annars lägg in siffran.**/
                    if (i % multiple == 0) {
                        result.add("Apendo!");
                        count++;
                    } else
                        result.add(i);
                }
            }
        }

        /** Om steglängden är större än eller likamed 1 **/
        if (stepNum >= 1) {
            /** Om multipel av heltalet är lika med 0 så loopa igenom och lägg till i listan.**/
            if (multiple == 0) {
                /** Antal varv loopen ska snurra bestäms av startvärdet i detta fall så är startvärdet lägre än
                 * slutvärdet och ökas för varje varv**/
                for (int i = start; i < end + 1; i = i + stepNum) {
                    result.add(i);
                }
            } else {
                /** Antal varv loopen ska snurra bestäms av startvärdet i detta fall så är startvärdet lägre än
                 * slutvärdet och ökas för varje varv**/
                for (int i = start; i < end + 1; i = i + stepNum) {
                    /** Om i vårat startvärdet är en multipel av variabeln multiple så lägg till ordet apendo istället annars lägg in siffran.**/
                    if (i % multiple == 0) {
                        result.add("Apendo!");
                        count++;
                    } else
                        result.add(i);
                }
            }
        }

        return result;
    }
    /** Den här funktionen är för Del C i uppgiften och den returnerar två saker.
     * 1. Siffran som ligger i postionen i index av talserien. positionen sätts av det tredje arugmentet i konstruktorn.
     * 2. Hur många gånger ordet appendo har skrivits ut i den senaste talserien **/
    public String AdvancedResults() {
        String numberInIndex = result.get(stepNum - 1).toString();
        return "The number in the index is: " + numberInIndex + "\n" + "Apendo appeard " + count + " times in this range";
    }

    /** Getters och Setters för klassen**/
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStepNum() {
        return stepNum;
    }

    public void setStepNum(int stepNum) {
        this.stepNum = stepNum;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }
}
