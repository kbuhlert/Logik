package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;
        System.out.println("Die Sonne scheint und es regnet? "+ ergebnis);   //sout + Tabulator = System.out.println

        boolean verwirrtIch = false;
        boolean auskennenIch = true;

        boolean checkerstatus = verwirrtIch || auskennenIch;    //Übung 2 auf Slide 22: Das Beispiel verwirrt mich ODER ich kenne mich aus
        System.out.println("Ich kenne mich aus " + checkerstatus);

        boolean term1 = (1>3 && (!(3<5)))||2==4;    // term1 ist die vorletzte Rechnung (Übung 3) auf der Übungsslide 22
        System.out.println("Der term 1 ist " + term1);

        boolean teil1 = 1>3;        // alternativer Lösungsweg indem der term1 in Teile zerlegt wird und dann die Teile verglichen werden
        boolean teil2 = (!(3<5));
        boolean teil3 = 2==4;

        boolean ergebnis2 = teil1 && teil2 || teil3;

        System.out.println("Ergebnis 2 ist "+ergebnis2);

        boolean term2 = (6>=2*3 || 2-3<0) && (1*1==1 && 1!=1+1); // term2 ist die lezte Rechnung (Übung4) auf Übungsslide 22
        System.out.println("Ergebnis 3 ist " + term2);

    }
}
