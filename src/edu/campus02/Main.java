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

        boolean checkerstatus = verwirrtIch || auskennenIch;
        System.out.println("Ich kenne mich aus " + checkerstatus);

        boolean term1 = (1>3 && (!(3<5)))||2==4;
        System.out.println("Der term 1 hat den boolean " + term1);
    }
}
