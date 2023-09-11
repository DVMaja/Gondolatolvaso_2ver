package gondolatolvaso;

import java.util.Scanner;

public class GondolatOlvaso {
    private static String[] pakli = new String[21];

    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }
    
    private static String[] Kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        
            int index = 0;          
            for (int szin = 0; szin < szinek.length; szin++) {
                for (int ertek = 0; ertek < ertekek.length-1; ertek++) {
                        pakli[index]= szinek[szin]+"_"+ertekek[ertek];
                        index++;
                }
            }
            
        for (int szamlalo = 0; szamlalo < pakli.length; szamlalo++) {
            if (szamlalo % 3 == 0) {
                System.out.println(" ");
                System.out.printf("%-8s", pakli[szamlalo]);
            } else {
                System.out.printf("%-8s", pakli[szamlalo]);
            }
        }          
        return pakli;
    }

    private static void Melyik() {
        System.out.println("");
        System.out.println("Kérem adja meg melyik oszlopot választja:");
        Scanner sc = new Scanner(System.in);
        boolean jo;
        
        do {
            System.out.println("oszlop(1-3): ");
            int oszlop = sc.nextInt();
            jo = oszlop>=1 && oszlop <= 3;
        } while (!jo);
        
    }

    private static void Kever() {
        
    }

    private static boolean EzVolt() {
        boolean ezVolt = false;
        return ezVolt;
    }
    
}
