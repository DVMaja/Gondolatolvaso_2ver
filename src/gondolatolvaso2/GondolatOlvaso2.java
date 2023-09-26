package gondolatolvaso2;

import java.util.Scanner;

public class GondolatOlvaso2 {

    private static String[] pakli = new String[22];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            int valasztottOszlop = Melyik();
            Kever(valasztottOszlop);
        }
        EzVolt();
    }

    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int index = 0;
        for (String szin : szinek) {
            for (int ertek = 0; ertek < ertekek.length && index < pakli.length; ertek++) {
                pakli[index++] = szin + "_" + ertekek[ertek];
            }
        }
    }

    private static void kirak() {
        for (int szamlalo = 1; szamlalo < pakli.length; szamlalo++) {
            //String lap = pakli[szamlalo];
            System.out.printf("%-8s", pakli[szamlalo]);
            if (szamlalo % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static int Melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.println("\nKérem adja meg melyik oszlopot választja:");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);

        return oszlop;
    }

    private static void Kever(int valasztottOszlop) {
        System.out.println("");
        //String helytarto;
        String[] ujPakli = new String[22];

        switch (valasztottOszlop) {
              case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;

    }

    private static void EzVolt() {
        System.out.println("Ez volt az Ön kártyája: |" + pakli[11] + "| ?");
    }

}
